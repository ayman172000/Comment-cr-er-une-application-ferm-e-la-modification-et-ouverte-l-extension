package Presentation;

import DAO.IDAO;
import Metier.IMetier;
import Metier.Metier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresenationV2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //Instanciation Dynamic Via Setter
        Scanner input =new Scanner(new File("Config.txt"));
        String classDaoName=input.nextLine();
        Class Cdao= Class.forName(classDaoName);
        /*au moment de l'execution la methode forname vas cherché la class classDaoName
        * s'il existe elle vas la chargée en memoire sous forme d'un objet de type Class
        * sinon elle vas generer une exception ClassNotFoundException
         */
        IDAO dao =(IDAO) Cdao.newInstance();// new instance retourne un objet de type OBJECT

        String classMetierName=input.nextLine();
        Class CMetier=Class.forName(classMetierName);
        //pour utiliser l'injection des dependence via Setter
        //IMetier metier=(IMetier) CMetier.newInstance();
        //Method method=CMetier.getMethod("setDao",IDAO.class);
        //method.invoke(metier,dao);
                /*
        la methode getMethode retourne la methode setDao qui recoit le parametre de type IDao
         */
        //pour utiliser l'injection des dependence via constructeur
        IMetier metier=(IMetier) CMetier.getDeclaredConstructor(IDAO.class).newInstance(dao);
        System.out.println(metier.calcul());





    }
}
