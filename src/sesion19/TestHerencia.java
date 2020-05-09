package sesion19;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHerencia {

    public static void main(String[] args) {
//        SubSubClase objeto = new SubSubClase();
        creaProgramadores();
    }
    

    static void creaProgramadores() {
        for (int i = 1; i <= 10; i++) {
            Programador progTmp = new Programador("Programador" + i, "ApellidoPaterno" + i, "ApellidoMaterno" + i, "Mexicana");
            progTmp.setIdiomas(new ArrayList<String>(Arrays.asList("Espanol", "ingles")));
            progTmp.setLenguajes(new ArrayList<String>(Arrays.asList("Java", "C++", "Cobol")));
            progTmp.setSalario(i * 10000);
            progTmp.setSenior(true);
            progTmp.setAniosExperiencia(i);
            progTmp.imprimePersona();
        }
    }
}
