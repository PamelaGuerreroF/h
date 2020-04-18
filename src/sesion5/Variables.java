package sesion5;

public class Variables {

    public String nombre;
    public String apellido;
    public static String banco = "Banco del bienestar";

    public void imprimeVariables() {
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("banco: " + banco);
    }

}
