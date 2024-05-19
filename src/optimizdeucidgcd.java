public class optimizdeucidgcd {
    public static void main(String[] args) {
        int a = gcd(3, 6);
        System.out.println(a);
    }
    public static int gcd(int A, int B) {
        //code here
       /* int a=(int)Math.pow(A,B);
          for(int i=a;i>=1;i--){
            if(A%i==0 && B%i==0){
                 return i;
            }
        }
     return 1;*/
        if (A == 0) {
            return B;
        }
        if (B == 0) {
            return A;
        }

        if (A > B) {
            return gcd(A % B, B);
        }
        return gcd(A, B % A);


    }
}


