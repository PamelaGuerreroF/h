/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion23;

public interface Perro {

    default void juega() {
        System.out.println("Estoy jugando");
    }

    default void correr() {
        System.out.println("Estoy corriendo");
    }
}
