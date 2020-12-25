public class Optimized {

    private static int func2(int a, int b, int c)  {
        int res = 0;
        for(int i = 0; i < 10; i++) {
            b--;
            if(c > b) {
                res = a + b;
            } else {
                res = a + c;
            }
            if(res > 0) {
                return res;
            }
        }
        return res;
    }

    //51 110 12
    public static void main(String[] args) {
        System.out.println(func2(51, 110, 12));
    }
}
