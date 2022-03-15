package EXT;

import DAO.IDAO;
import org.springframework.stereotype.Component;

@Component("Dao2")
public class DaoImpleV2 implements IDAO {
    @Override
    public double getData() {
        System.out.println("Version Capteur");
        return 99*Math.random();
    }
}
