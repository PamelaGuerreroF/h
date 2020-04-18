package sesion5;

import sesion3.ejercicio.TestCliente;

public class TestVariables {

    public static void main(String[] args) {
        
        TestCliente testCl = new TestCliente();

        String banco = Variables.banco;
        System.out.println("banco: " + banco);

        
        for (int i = 1; i <= 10; i++) {
            Variables variableTemporal = null;
            System.out.println("*****Variable " + i + "*****");
            variableTemporal = new Variables();
            variableTemporal.nombre = "Juan" + i;
            variableTemporal.nombre = "Juan" + i + " Pedro";
            variableTemporal.apellido = "Martinez";
            variableTemporal.imprimeVariables();
        }
    }
}
