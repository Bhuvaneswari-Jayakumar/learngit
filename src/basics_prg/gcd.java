package basics_prg;

public class gcd {
    public static void main(String[] args) {
        int a = 12, b = 42;
        int min = 0;
        // if(a>b){
        //    min=b;
        //  }
        min = a;
        //brute force approach
     /*   for(int i=min;i>0;i--){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }*/
// eucid algorithm
        while (a != b) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
// eucid algorithm
