/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion15;

public class Fabrica {

    static int numSerie;

    public static int asignarNumSerie() {
        ++numSerie;
        return numSerie;
    }
    
}
