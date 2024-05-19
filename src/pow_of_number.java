public class pow_of_number {
    public static void main(String[] args) {

        int N=7;
        int X=2;
        //Your code here
        double mod = 1e9 + 7;
        double ans = 1;
        while (N > 0) {
            if (N % 2 == 0) {
                X = X * X;
                N = N / 2;
                System.out.println("base:"+X);
                System.out.println("power:"+N);
            }
            if (N % 2 == 1) {
                ans = ans * X;
                N = N - 1;
                System.out.println("base:"+X);
                System.out.println("power:"+N);
            }
        }

    }
        }
