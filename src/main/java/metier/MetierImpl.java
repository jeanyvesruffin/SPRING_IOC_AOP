package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;


    /*
    * 1er solution Pour injecter dans la valeur dao un objet d'uen classe qui implémente l'interface IDao
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    // Couplage faible
    @Override
    public double calcule() {
        double temp = dao.getData();
        double res = temp * 10;
        return res;
    }

}
