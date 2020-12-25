public class Initial {

    private static int func1(int a, int b) throws InterruptedException {
        int res = 0;
        for(int i = 0; i < 10; i++)
        {
            Thread.sleep(1);
            if(i>8)
                res = resultOfSum(a, b);
            if(res > 0)
                return res;
        }
        return res;
    }

    private static int func2(int a, int b, int c) throws InterruptedException {
        int res = 0;
        for(int i = 0; i < 10; i++) {
            b--;
            if(c > b) {
                res = func1(a, b);
            } else {
                res = func1(a, c);
            }
            if(res > 0) {
                return res;
            }
        }

        return res;
    }

    private static int  resultOfSum(int a, int b) {
        return a + b;
    }
    //51 110 12
    public static void main(String[] args) throws InterruptedException {
        System.out.println(func2(51, 110, 12));
    }
}
