package sesion15;

public class PruebaMetodos {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Fabrica fab = new Fabrica();
            System.out.println("Numero de serie: " + fab.asignarNumSerie());
//            System.out.println("Numero de serie: " + Fabrica.asignarNumSerie());
        }

    }

}
