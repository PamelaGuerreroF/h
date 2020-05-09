package sesion19;

import java.util.ArrayList;
import sesion10.Persona;

public class Programador extends Persona {

    private int aniosExperiencia;
    private ArrayList<String> lenguajes;
    private double salario;
    private ArrayList<String> idiomas;
    private boolean senior;

    public Programador(String nombre, String apPaterno, String apMaterno, String nacionalidad) {
        super(nombre, apPaterno, apMaterno, nacionalidad);
    }

    public Programador(int aniosExperiencia, ArrayList<String> lenguajes, double salario, ArrayList<String> idiomas, boolean senior, String nombre, String apPaterno, String apMaterno, String nacionalidad) {
        super(nombre, apPaterno, apMaterno, nacionalidad);
        this.aniosExperiencia = aniosExperiencia;
        this.lenguajes = lenguajes;
        this.salario = salario;
        this.idiomas = idiomas;
        this.senior = senior;
    }
    
    

    public void imprimePersona() {
//        System.out.println("Nombre: " + this.getNombre());
//        System.out.println("Paterno: " + this.getApPaterno());
//        System.out.println("Materno: " + this.getApMaterno());
//        System.out.println("Nacionalidad: " + this.getNacionalidad());
        super.imprimePersona();
        System.out.println("aniosExperiencia: " + getAniosExperiencia());
        System.out.println("lenguajes: " + getLenguajes());
        System.out.println("salario: " + this.getSalario());
        System.out.println("idiomas: " + this.getIdiomas());
        System.out.println("senior: " + this.isSenior());
        identificate();
        comer();
    }
    
    public static void identificate() {
        System.out.println("Soy un programador");
    }
    
    public void comer() {
        System.out.println("Alimenta de cafe");
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

}
