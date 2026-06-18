package presentation;

// import org.springframework.boot.autoconfigure.SpringBootApplication;

import dao.DaoImpl;
import metier.MetierImpl;

// @SpringBootApplication
public class Presentation_V1 {

    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        DaoImpl dao = new DaoImpl();
        metier.setDao(dao);
        System.out.println("Resultat : " + metier.calcule());
        

    }

}

