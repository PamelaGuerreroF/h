package sesion13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
//        pruebaArrayList();
        testFunciones();
    }

    public static void pruebaArrayList() {
//        System.out.println("Hola");
//        ArrayList<String> ref1 = new ArrayList<String>();
//        ArrayList<String> ref1 = new ArrayList<>();
        ArrayList <String> ref1 = new ArrayList();
        ArrayList ref2 = new ArrayList(5);
        ArrayList ref3 = new ArrayList(ref2);
        System.out.println(ref2 == ref3);
        
        List <String> ref4 = new ArrayList();
//        ArrayList <String> ref5 = new List();
    }
    public static void testFunciones() {
        List <String> ref4 = new ArrayList();
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
    }
    
}