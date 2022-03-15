package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args)
    {
        ApplicationContext context=
                new AnnotationConfigApplicationContext("DAO","Metier");
        /*ApplicationContext context=
                new AnnotationConfigApplicationContext("DAO","Metier","EXT");
                *s'amarche avec autowired et qualifier
                */
        // on demande a spring de scanner les packages DAO et Metier pour cherche les Component et les autowired
        IMetier metier =(IMetier)context.getBean(IMetier.class);
        System.out.println("Res=>"+metier.calcul());

    }
}
