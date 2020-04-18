package sesion9;

public class FlujoAvanzado {

    public static void main(String[] args) {
        testEtiquetas1();
    }

    public static void testEtiquetas1() {
        PRIMER_FOR:
        for (int i = 1; i <= 50; i++) {
            System.out.println("***NOMBRE i: " + i);
            SEGUNDO_FOR:
            for (int j = 1; j <= 5; j++) {
                System.out.println("MATERIA: " + j);

                System.out.println("antes del continue");
                if (j <= 5) {
                    break PRIMER_FOR;
//                    continue PRIMER_FOR;
//                    break;
//                    continue;
                }
//                continue;
                System.out.println("despues del continue");
            }
        }
        System.out.println("hhhh");
    }

}
