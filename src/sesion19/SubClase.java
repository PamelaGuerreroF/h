package sesion19;

public class SubClase extends SuperClase {

    public SubClase(String nombre) {
        System.out.println("Con argumento");
        System.out.println("SubClase" + nombre);
    }
    
    public SubClase() {
        System.out.println("Sin argumento");
        System.out.println("SubClase");
    }
}
