package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXML {
    public static void main(String[] args)
    {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("config.xml");
        // lire le fichier config.xml
        IMetier metier=(IMetier) context.getBean("Metier");
        System.out.println("res=>"+metier.calcul());
    }
}
