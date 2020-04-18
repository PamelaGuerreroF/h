package sesion8;

import java.util.ArrayList;

public class TestSentencias {

    public static void main(String[] args) {
        testSwitch("holajuan");
//        testWhile(5);
//        testDoWhile(5);
//        testFor(5);
//        testForEach();
    }

    public static void testSwitch(String argumento) {
//                    juanito
        switch (argumento) {
            default: {
                System.out.println("Ninguna de las anteriores");
                break;
            }
            case "hola" + "juan": {
                System.out.println("x = 1");
                break;
            }
            case "adios": {
                System.out.println("x =2");
                break;
            }
            case "bye": {
                System.out.println("x = 3");
                break;
            }
        }
        if (1 < 1) {
            System.out.println("ggg");
        }
    }

    public static void testWhile(int argumento) {
        while (argumento == 10) {
            System.out.println("valor es igual a 5");
            ++argumento;
        }

    }

    public static void testDoWhile(int argumento) {
        do {
            System.out.println("valor es igual a 5");
            ++argumento;
        } while (argumento <= 10);
    }

    public static void testFor(int argumento) {
        for (int numeroAlumnos = 0; numeroAlumnos < 10; numeroAlumnos++) {
            System.out.println("valor de i: ");
        }
    }

    public static void testForEach() {
        ArrayList<String> lista = new ArrayList();
        lista.add("hola1");
        lista.add("hola2");
        lista.add("hola3");
        int j = 0;

        for (String tmp : lista) {
//            System.out.println("j: " + j);
            System.out.println("tmp: " + tmp);
            j++;
        }

        int tamanio = lista.size();

        System.out.println("tamanio: " + tamanio);

        for (int i = 0; i < tamanio; i++) {
            System.out.println("i: " + i);
        }
    }

}
