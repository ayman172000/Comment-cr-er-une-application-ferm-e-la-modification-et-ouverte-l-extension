package DAO;

import org.springframework.stereotype.Component;

@Component("daoViaAnotation")
/*
* à chaque demmarge si spring trouve une class qui commance par @Component il va l'instanciée
 */
public class DaoImpleV1 implements  IDAO{

    @Override
    public double getData() {
        System.out.println("Version BD");
        return Math.random()*50;
    }
}
