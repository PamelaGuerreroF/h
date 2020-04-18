package mx.com.develop.banco.dominio;

public class Cuenta {
    
    public int numeroCuenta;
    public String propietario;
    public double saldo;
    
    public static void main(String[] args) {
        Cuenta cta = new Cuenta();
        cta.mostrarCuenta("");
    }

    /**
     * Imprime en consola el numero de cuenta
     * 
     * @param nombreCliente nombre resultado de consultar en bd     * 
     * @return cadena para ejemplificar el funcionamiento de <code>return</code> return
     */
    public String mostrarCuenta(String nombreCliente) {
        System.out.println("numeroCuenta: " + numeroCuenta);
        System.out.println("numeroCuenta: " + numeroCuenta);
        return "cadena de ejemplo";
    }
}
