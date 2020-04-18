package sesion5;

public class Cliente {

    public static String pais = "Mexico";
    public int numeroCliente;

    public String getTipoCuenta() {
        return "Ahorros";
    }

    public void imprimeCliente() {
        System.out.println("pais: " + pais);
        System.out.println("numeroCliente: " + numeroCliente);
        System.out.println("Tipo cuenta: " + getTipoCuenta());
    }
}
