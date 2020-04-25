package sesion15;

public class TestVarArgs {

    public static void main(String[] args) {
//        walk(1);
//        walk(1, 2);
        walk(652, 2, 3, 8);
        walk(652, new int[]{2, 3, 8});
    }

    public static void walk(int start, int... nums) {
        System.out.println(start);
        System.out.println(nums.length);
    }

    public static void testVarArgs() {

    }

    public void primera(int... nums) {

    }

    public void segunda(int start, int... nums) {

    }

//    public void tercera(int ... nums, int start) {
//        
//    }
}
