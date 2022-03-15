package Metier;
import DAO.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("MetierViaAnnotation")
public class Metier implements IMetier{
    //@Autowired
    //@Qualifier("Dao2")
    /*
    * Autowired s'occupe de l'injection des dependance a travers les object de type IDAO deja cree par spring
    * (les class qui implemente l'interface IDAO qui contient @component)
    * il est Mieux d'utiliser un constructeur parameter au lieu de autowired
     */
    private IDAO Dao;
    @Override
    public double calcul() {
        double temp=Dao.getData();
        return temp*15/Math.cos(15);
    }
    /*public void setDao(IDAO dao) {
        Dao = dao;
    }*/
    /*
    * pour utiliser l'injection via un constructeur par parametré on est obligé de modifier dans la class
        presenationV1 car on utilise dans cette derniere un constructeur par default avec un setter
        * aussi dans le fichier Xml pour utiliser le constructeur au lieu de setter
     */
    public Metier(IDAO dao) {
        Dao = dao;
    }
}
