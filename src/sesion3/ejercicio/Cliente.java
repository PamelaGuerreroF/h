package sesion3.ejercicio;

public class Cliente {
    
    public static String banco = "Banco de Mexico";
    
    public String nombre;
    public String apellidos;
    Cuenta miCuenta;

    public void imprimeDatosCliente() {
        System.out.println("nombre: " + nombre);
        System.out.println("apellidos: " + apellidos);        
    }
    
    public void imprimeDatosClienteEj2() {
        System.out.println("nombre: " + nombre);
        System.out.println("apellidos: " + apellidos);        
    }
    
    
}
