package Presentation;
import DAO.DaoImpleV1;
import DAO.IDAO;
import Metier.Metier;

public class PresentationV1 {
    public static void main(String[] args)
    {
        //Instanciation Static
        IDAO dao=new DaoImpleV1();
        Metier metier=new Metier(dao);
        //metier.setDao(dao);
        System.out.println("Resultat=>"+metier.calcul());
    }
}
