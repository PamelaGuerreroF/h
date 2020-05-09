package sesion10;

import sesion14.TestTime;

public class Persona {
    
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String nacionalidad;

//    public Persona() {
//    }

    public Persona(String nombre, String apPaterno, String apMaterno, String nacionalidad) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.nacionalidad = nacionalidad;
    }
    
    public void imprimePersona() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Paterno: " + this.getApPaterno());
        System.out.println("Materno: " + this.getApMaterno());
        System.out.println("Nacionalidad: " + this.getNacionalidad());
        identificate();
        comer();
    }
    
//    public static final void identificate() {//Metodo final, no sobreescribible
    public static void identificate() {
        System.out.println("Soy una persona, de nacionalidad Mexicana");
    }
    
    public void comer() {
        System.out.println("Alimenta balanceadamente");
    }
        
    public static void main(String[] args) {
        TestTime objeto = new TestTime();
        objeto.pruebaTime();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}
