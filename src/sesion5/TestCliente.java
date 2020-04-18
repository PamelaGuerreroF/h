package sesion5;

public class TestCliente {

    public static void main(String[] args) {
        TestCliente testClienteInst = new TestCliente();
        testClienteInst.pruebaCliente();
        System.gc();
        System.out.println("Fin del programa");
    }

    /**
     * Metodo de prueba
     */
    public void pruebaCliente() {
        for (int i = 0; i < 5; i++) {
            Cliente clienteTmp = new Cliente();
            clienteTmp.numeroCliente = i;
            clienteTmp.imprimeCliente();
        }

        Cliente clienteTmp1 = new Cliente();
        Cliente clienteTmp2 = new Cliente();
        Cliente clienteTmp3 = new Cliente();
        Cliente clienteTmp4 = new Cliente();
        clienteTmp1.imprimeCliente();
        clienteTmp1 = null;

        /**
         * sentencia 1 sentencia 2 sentencia 3
         */
    }
}
