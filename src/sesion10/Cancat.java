package sesion10;

public class Cancat {

    public static void main(String[] args) {
        concat();
    }

    public static void concat() {
        System.out.println(8 + 5);
        System.out.println("Suma: " + 8 + 5);
        
        String nombre  = "Juan";
        nombre = nombre + " Mendez";
//        nombre = nombre.concat(" Mendez");
        System.out.println(nombre);
    }
}
