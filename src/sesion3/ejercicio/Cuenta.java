package sesion3.ejercicio;

public class Cuenta {

    /**
     * Numero de cuenta de ahorros del cliente
     */
    int numeroCuenta;
    
    /**
     * nombre completo del cliente
     */
    String propietario;

    public void imprimeCuenta() {
        System.out.println("numeroCuenta: " + numeroCuenta);
        System.out.println("propietario: " + propietario);
    }
}
