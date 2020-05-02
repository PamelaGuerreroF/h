package sesion16;

public class TestStatic {

    private static int one;
    private static final int two;
    private static final int three;// = 3;
    private static final int four;

    static {
        one = 1;
        two = 2;
        three = 3;
        four = 4;
    }

    public static void main(String[] args) {

        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.nombre = "Koala1";
        koala1.count = 6;
        koala1 = null;
        koala2.count = 5;
//        System.out.println("Koala.count: " + Koala.count);
//        Koala.nombre = "Koala";
        int number = 4;
        newNumber(number);
        System.out.println("number: " + number);
        newNumber(Koala.count);
        newNumber(Koala.count, 8);
        System.out.println("Koala.count: " + Koala.count);
    }

    public static void newNumber(int number) {
        System.out.println("number: " + number);
        number = 7;
        System.out.println("");
        System.out.println(true);
        System.out.println(8);
        System.out.println('c');
    }
    
    public static void newNumber(int number, int number2) {
//        int number = 7;
        System.out.println("number: " + number);
        System.out.println("");
        System.out.println(true);
        System.out.println(8);
        System.out.println('c');
    }
}
