/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion17;

public class TestConstructor {

    String nacionalidad;
    int edad;
    final int nacimiento;
//    String nacionalidad = "Mexicana";

    private TestConstructor() {
        this("Mexicana");
//        this.nacionalidad = "Mexicana";
//        System.out.println("Hola, tu nacionalidad es " + this.nacionalidad);
    }

    private TestConstructor(String nacionalidad) {
        this(nacionalidad, 18);
//        this.nacionalidad = nacionalidad;
//        System.out.println("Hola, tu nacionalidad es " + this.nacionalidad);
    }
    
    private TestConstructor(String nacionalidad, int edad) {
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        System.out.println("Hola, tu nacionalidad es " + this.nacionalidad);
        System.out.println("Hola, tu edad es " + this.edad);
        nacimiento = 1990;
    }

    public static void main(String[] args) {
        TestConstructor test1 = new TestConstructor();
        TestConstructor test2 = new TestConstructor("Española");
        TestConstructor test3 = new TestConstructor("Francesa", 25);

        System.out.println(test1.nacionalidad);
        System.out.println(test2.nacionalidad);
        System.out.println(test3.nacionalidad);
//        test.hola();
//        ConstructorPrivado consPriv = new ConstructorPrivado();
        ConstructorPrivado consPriv = ConstructorPrivado.getObjeto();

    }

//    public void hola() {
//        System.out.println("Hola mundo");
//    }
}
