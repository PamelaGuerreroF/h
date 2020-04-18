package sesion3;

public class Primitivos {

    public static void main(String[] args) {
        testChar();
        testBoolean();
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        testInt();

    }

    public static void testChar() {
        char oneChar = 64;
        System.out.println("oneChar: " + oneChar);
        oneChar = 'o';
        System.out.println("oneChar: " + oneChar);

    }

    public static void testBoolean() {
        boolean resultado = (5 != 6);
        System.out.println("resultado: " + resultado);
    }

    public static void testInt() {
        int unMillon = 1_000_000;
        System.out.println("unMillon: " + unMillon);
    }

    public static void pruebaVariables() {
        String var1, var2, var3;
        var1 = "2";
        var2 = "2";
        var3 = "3";
        String var4;
        int v2;
        System.out.println("" + var1);
        int i1, i2;
    }
}
