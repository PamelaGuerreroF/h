package sesion11;

public class StringBuilderTest {

    public static void main(String[] args) {
//        testString();
//        testStringBuilder();
        testStringBuilder2();
    }

    public static void testString() {
        String alpha = "";
        for (char actual = 'a'; actual <= 'z'; actual++) {
            alpha += actual;
            System.out.println(alpha);
        }
        System.out.println("alpha:" + alpha);
        System.out.println("alpha.length(): " + alpha.length());
    }

    public static void testStringBuilder() {
        StringBuilder alpha = new StringBuilder();
        for (char actual = 'a'; actual <= 'z'; actual++) {
            alpha.append(actual);
            System.out.println(alpha);
        }
        System.out.println("alpha:" + alpha);
        System.out.println("alpha.length(): " + alpha.length());
    }

    public static void testStringBuilder2() {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

//        "cadena".concat("algo").concat("algo mas").
        System.out.println(a.reverse());
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}
