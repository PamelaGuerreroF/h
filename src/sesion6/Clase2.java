package sesion6;

public class Clase2 {

    public void hola() {
        String saludo = "Juan";
        System.out.println("Hola " + saludo);
    }

    protected void finalize() throws Throwable {
        System.out.println("Finalize");
        super.finalize();
    }
}
