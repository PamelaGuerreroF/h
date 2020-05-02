package sesion18;

public class CalculadoraLambda {

    public static void main(String[] args) {

        ICalculadoraLambda iSuma = (x, y) -> x + y;
        
        System.out.println(5 + 7);
        System.out.println(iSuma.operacion(5, 7));

        ICalculadoraLambda iResta = (x, y) -> x - y;
        System.out.println(iResta.operacion(5, 7));
    }
}
