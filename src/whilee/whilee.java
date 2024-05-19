package whilee;
import java.util.Scanner;
public class whilee {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r;
        int evensum = 0, oddsum = 0;

        while (n > 0) {
            r = n % 10;
            if (r % 2 == 0) {
                evensum += r;
            } else {
                oddsum += r;
            }
            n = n / 10;
        }

        System.out.print(evensum);
        System.out.print(oddsum);
    }
}
