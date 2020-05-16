/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion23;

public class Chichuahua implements Perro {

    @Override
    public void juega() {
        System.out.println("Juega 10 minutos y se cansa");
    }

    @Override
    public void correr() {
        System.out.println("Corren media hora y se duermen");
    }
    
    public void tiembla() {
        System.out.println("Tiemblo por distintas razones");
    }

}
