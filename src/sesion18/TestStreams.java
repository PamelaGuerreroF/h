package sesion18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList();
        listaEnteros.add(821);
        listaEnteros.add(83);
        listaEnteros.add(84);
        listaEnteros.add(5);
        Stream st = listaEnteros.stream();
        System.out.println(st.filter(Predicate.isEqual(5)).count());
    }
}
