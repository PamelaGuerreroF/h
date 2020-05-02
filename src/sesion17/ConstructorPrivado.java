/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion17;

public class ConstructorPrivado {
    
    private String password = "$#%#$%dsfgsdf$#";
    private static String tarjeta = "1111222244443333";
    private static boolean activo = false;
    private static boolean aprobado = false;

    private ConstructorPrivado() {
        this.password = "$#%#$%dsfgsdf$#";
        System.out.println("Usando el constructor");
    }
    
    public static ConstructorPrivado getObjeto() {
        System.out.println("Hola");
        return new ConstructorPrivado();
    }

    public String getPassword() {
        return this.password.substring(0, 2);
    }
//
//    public static void setPassword(String password) {
//        ConstructorPrivado.password = password;
//    }

    public static String getTarjeta() {
        return tarjeta.substring(0, 4);
    }

    public static void setTarjeta(String tarjeta) {
        ConstructorPrivado.tarjeta = tarjeta;
    }

    public static boolean isActivo() {
        return activo;
    }

    public static void setActivo(boolean activo) {
        ConstructorPrivado.activo = activo;
    }

    public static boolean isAprobado() {
        return aprobado;
    }

    public static void setAprobado(boolean aprobado) {
        ConstructorPrivado.aprobado = aprobado;
    }

}
