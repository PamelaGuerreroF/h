/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas implements Edades {

    public static void main(String[] args) {
        List<Integer> edadesList = Arrays.asList(14, 56, 56, 8, 9, 78);
        List<Integer> listaResultado = new ArrayList();
        Edades.MayorEdad objeto = a -> a >= 18;
//        edadesList.forEach(x -> listaResultado.add(objeto.mayorEdad(x) ? x : 0));
        edadesList.forEach(x -> System.out.println(x));
//        System.out.println(listaResultado);
//for(var x: lista){
//x.concat...
//listaResultado.add(objeto.mayorEdad(x) ? x : 0)
//    }
    }
}
