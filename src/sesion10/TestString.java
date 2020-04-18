/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion10;

public class TestString {

    String nacionalidad = "Mexicana";

    public void testPersonas() {
        int totalPersonas = 10;
        for (int contador = 1; contador <= totalPersonas; contador++) {
            Persona persTmp = new Persona();
            
//            String nombre = new String("Juan");
            persTmp.nombre = new String("Juan");
            persTmp.apPaterno = "paterno " + contador;
            persTmp.apMaterno = "materno ".concat("" + contador).toUpperCase();
            persTmp.nacionalidad = nacionalidad;
            System.out.println(persTmp.nombre);
            System.out.println(persTmp.apPaterno);
            System.out.println(persTmp.apMaterno);
            System.out.println(persTmp.nacionalidad);
        }
    }
}
