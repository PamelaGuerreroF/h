/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion19;

public class SubSubClase extends SubClase{
    
    String nombre;
    String apPaterno;
    String apMaterno;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SubSubClase() {
        System.out.println("SubSubClase");
    }

}
