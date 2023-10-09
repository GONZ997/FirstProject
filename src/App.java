public class App {
    public static void main(String[] args) throws Exception {
        AppleModel  appleModel = new AppleModel("green", "Granny", 2, false); 
    //    System.out.printIn(appleModel.juiceApple(0));
    }  


    /**
 * @param a
 * @param b
 * @return
 */

    public static int add(int a, int b) {
        return a + b;
    }

    public static int divideInt(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static boolean isEven(int a) {
        return remainder(a, 2) == 0;
    }
}
