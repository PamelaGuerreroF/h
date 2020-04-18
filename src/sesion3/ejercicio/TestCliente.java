package sesion3.ejercicio;

public class TestCliente {

    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        miCliente.nombre = "Juan";
        miCliente.apellidos = "Martinez";
        
        System.out.println("main");
        miCliente.imprimeDatosCliente();
        System.out.println("*********************");

        testMain(miCliente);
        
        Cuenta miCuenta = new Cuenta();
        miCuenta.numeroCuenta = 454545122;
        miCuenta.propietario = miCliente.nombre + " " + miCliente.apellidos;

        System.out.println("*********************");
        miCliente.miCuenta = miCuenta;
        miCliente.miCuenta.imprimeCuenta();
        
        suma();
    }
    
    
    public static void testMain(Cliente miCliente) {
//    public static void testMain() {
        System.out.println("testMain");
        miCliente.imprimeDatosCliente();
    }
    
    public static void suma() {
        int x = 10;
        int y = 5;
        int suma = x + y;
        System.out.println("suma: " + suma);
    }
    
}
