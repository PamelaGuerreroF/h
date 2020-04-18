package sesion7;

public class OperadoresBinarios {

    public static void main(String[] args) {
//        testBinarios();
//        testModulo();
//        testPromotion();
//        testBoolean();
//        operadorUnarios();
        opCompuesto3();
    }

    public static void testBinarios() {
        System.out.println("testBinarios");
        //        30 + 12 - 50 - 10
        int x = 10 * 3 + 2 * 6 - 10 * 5 - 10;
        System.out.println("x: " + x);
        //        10 * -30
        //        10 *    (30 - 50 - 10 )
        //      10 * (    5    * 6 -    50    -10)
        int a = 10 * ((3 + 2) * 6 - (10 * 5) - 10);
        System.out.println("a: " + a);
    }

    public static void testModulo() {
        System.out.println(9 / 3);
        System.out.println(9 % 3);
        System.out.println(10 / 3);
        System.out.println(10 % 3);
        System.out.println(11 / 3);
        System.out.println(11 % 3);
    }

    public static void testPromotion() {
        int num1 = 55555;
        long num2 = 66666;
        long num3 = num1 * num2;
        System.out.println("num3: " + num3);
    }

    public static void testBoolean() {
        boolean mayorEdad = false;
        System.out.println("mayorEdad: " + mayorEdad);
        System.out.println("mayorEdad: " + !mayorEdad);
    }

    public static void unarios() {
        int a = -5;
        boolean b = !true;
        boolean c = !false;
    }

    public static void operadorUnarios() {
        int a = 0;
        int b = a++;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void opCompuesto() {
        int x = 5;
        int y = 8;
//        y = x + y;
//        System.out.println("y: " + y);
        y += x;
        System.out.println("y: " + y);
        y -= x;
        System.out.println("y: " + y);
        y *= x;
        System.out.println("y: " + y);
        y /= x;
        System.out.println("y: " + y);
        y %= x;// y = y % x
        System.out.println("y: " + y);
    }
    
    public static void opCompuesto2() {
        long x = 10;
        int y= 5;
        y *= x;
    }
    
    public static void opCompuesto3() {
        boolean x = 5 == 3;
        System.out.println("x: " + x);
    }

}
