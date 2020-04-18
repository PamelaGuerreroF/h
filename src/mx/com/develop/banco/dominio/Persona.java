package mx.com.develop.banco.dominio;

import mx.com.develop.banco.prueba.Credencial;
import mx.com.develop.banco.prueba.Fiesta;

public class Persona {
    public static void main(String[] args) {
        Fiesta fiestasabado = null;
        System.out.println("fiestasabado: " + fiestasabado);
        fiestasabado = new Fiesta();
        System.out.println("fiestasabado: " + fiestasabado);
        
        Credencial miCredencial = new Credencial();
        
        System.out.println("miCredencial: " + miCredencial.nombre + ", edad: " + miCredencial.edad);
        System.out.println("miCredencial: " + miCredencial.edad);
    }
}
