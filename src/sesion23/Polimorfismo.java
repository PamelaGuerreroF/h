package sesion23;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * Clase de ejemplo polimorfismo
 *
 * @author asyou_000
 */
public class Polimorfismo {

    public static void main(String[] args) {
        List<String> al = new ArrayList();//**

        Polimorfismo poli = new Polimorfismo();
        Object poli1 = new Polimorfismo();//**

        Chichuahua chihuahua = new Chichuahua();
        chihuahua.tiembla();
        Perro perroChichuahua = chihuahua;

        poli.conoceAlPerro(chihuahua);
//        perroChichuahua.juega();
//        chihuahua.juega();
        chihuahua = null;
//        perroChichuahua.juega();
//        chihuahua.juega();
        Perro perro = new Chichuahua();
        Object objetoPerro = perro;
        
        Object objeto = new Chichuahua();
        
//        Polimorfismo objetoChihuahua = (Polimorfismo) objeto;
        
//        objeto.correr();
        poli.conoceAlPerro((Perro) objeto);

        Object objeto2 = new Object();
        poli.conoceAlPerro(new Labrador());
    }

    public void conoceAlPerro(Perro perro) {
        perro.correr();
        perro.juega();
    }

}
