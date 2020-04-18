package sesion12;

import java.util.Arrays;

public class Arreglos {

    public static void main(String[] args) {
//        pruebaArreglos();
//        pruebaArreglosString();
//        ordenacion();
        busqueda();
    }

    public static void pruebaArreglos() {
        int[] arregloInts = {1, 2, 3, 4, 5};
        System.out.println(arregloInts.length);
        System.out.println(arregloInts[4]);
    }

    public static void pruebaArreglosString() {
//        String[] arregloStrings = {"Hola 1", "Hola 2", "Hola 3", "Hola 4"};
        String[] arregloStrings = new String[]{"Hola 1", "Hola 2", "Hola 3", "Hola 4"};

        System.out.println(arregloStrings.length);
        System.out.println(arregloStrings[3]);

        for (String elem : arregloStrings) {
            System.out.println("elem: " + elem);
        }

        for (int i = 0; i < arregloStrings.length; i++) {
            System.out.println(arregloStrings[i]);
        }

        String[] arregloStrings2 = arregloStrings;

        System.out.println(arregloStrings.equals(arregloStrings2));

        System.out.println(arregloStrings.toString());

    }

    public static void pruebaArreglos2() {
        int[] arr1, arr2, arr3;
//        int arr1[], arr2, arr3;
    }

    public static void ordenacion() {
        int[] arregloInts = {56, 45, 17, 32, 20};
        Arrays.sort(arregloInts);
        for (int tmp : arregloInts) {
            System.out.println("tmp: " + tmp);
        }
    }

    public static void busqueda() {
        int[] arreglo = {15, 15, 15, 0, 28};
        Arrays.sort(arreglo);
        System.out.println("El valor 0 se encuentra en: " + Arrays.binarySearch(arreglo, 15));
    }

    public static void bidimensional() {

        int[][] arregloBid = {{15, 15}, {15, 8}, {0, 28}};
    }

}
