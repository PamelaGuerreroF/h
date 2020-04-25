package sesion13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ejemplo
 */
public class ArrayListTest {

    public static void main(String[] args) {
//        pruebaArrayList();
//        testFunciones();
//        ejercicio();
//        ejercicio2();
        ejercicio3();
    }

    public static void pruebaArrayList() {
//        System.out.println("Hola");
//        ArrayList<String> ref1 = new ArrayList<String>();
//        ArrayList<String> ref1 = new ArrayList<>();
        ArrayList<String> ref1 = new ArrayList();
        ArrayList ref2 = new ArrayList(5);
        ArrayList ref3 = new ArrayList(ref2);
        System.out.println(ref2 == ref3);

        List<String> ref4 = new ArrayList();
//        ArrayList <String> ref5 = new List();
    }

    public static void testFunciones() {
        List<String> ref4 = new ArrayList();
        ref4.add("Cadena 1");
        ref4.add("Cadena 2");
        ref4.add("Cadena 3");
        ref4.add("Cadena 4");
        ref4.add("" + 345);
        System.out.println("1. ref4:\n" + ref4);
        ref4.remove("Cadena 1");
        System.out.println("2. ref4:\n" + ref4);
        ref4.remove(2);
        System.out.println("3. ref4:\n" + ref4);
        ref4.set(2, "Cadena4");
        System.out.println("3. ref4:\n" + ref4);
        System.out.println("ref4.isEmpty(): " + ref4.isEmpty());
        System.out.println("ref4.size(): " + ref4.size());
        ref4.clear();
        System.out.println("ref4.size(): " + ref4.size());
        ref4.add("Cadena 4");
        System.out.println("ref4.size(): " + ref4.contains("Cadena 4"));
        System.out.println("ref4.size(): " + ref4.contains("Cadena 3"));
        ArrayList ref5 = new ArrayList(ref4);
        System.out.println(ref4 == ref5);
        System.out.println(ref4.equals(ref5));
        ref4.add("Cadena 5");
        System.out.println("3. ref4:\n" + ref4);
        ref4.add(0, "Cadena ");
        System.out.println("3. ref4:\n" + ref4);
    }

    public static void ejercicio() {
        List<String> listaNombres = new ArrayList();
        listaNombres.add("Juan");
        listaNombres.add("Pedro");
        listaNombres.add("Ana");
        listaNombres.add("Veronica");
        List<String> listaApellidos = new ArrayList(listaNombres);
        System.out.println(listaNombres.equals(listaApellidos));
    }
    
    public static void ejercicio2() {
        List<String> list = new ArrayList();
        list.add("Juan");
        list.add("Pedro");
        Object [] arreglo = list.toArray();
        System.out.println(arreglo.length);
        String [] arregloStrings = list.toArray(new String[0]);
        System.out.println(arregloStrings.length);
        
    }
    
    public static void ejercicio3() {
        List<Integer> numbers = new ArrayList();
        numbers.add(99);
        numbers.add(96);
        numbers.add(9);
        numbers.add(19);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        
    }

}
