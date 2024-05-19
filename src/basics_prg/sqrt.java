package basics_prg;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        int ans=1,i=1,j=2;

        while(ans<n) {
            System.out.println("enter2");
            ans = j * j;
            i+=1;
            j+=1;
        }
        System.out.println(i);
    }
}
