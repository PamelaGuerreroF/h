package sesion18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas2 {

    static boolean isMayorEdad(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {
        List<Integer> edadesList = Arrays.asList(14, 56, 56, 8, 9, 78);
        List<Integer> listaResultado = new ArrayList();
//        Stream st = edadesList.stream();
        listaResultado = edadesList.stream().filter(Lambdas2::isMayorEdad).collect(Collectors.toList());
        System.out.println(listaResultado);
    }
}
