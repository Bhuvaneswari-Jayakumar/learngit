package linearSearch;

import java.util.Scanner;

public class StringLinear {
    public static void main(String[] args) {
        String str;
        System.out.println("enter the string:");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        System.out.println("enter the elements to be found:");
        char a = in.next().charAt(0);
        boolean ans2=linearsearchstring2(str,a);
        System.out.println("found:"+ans2);
       int ans= linearsearchstring(str,a);
       if(ans==-1){
           System.out.println("given character not found");
       }
       else {
           System.out.println("given character is found in "+ ans+ " position");
       }
    }
    // this function is going to print the index position of the string if the given character is found in the particular string
        public static int linearsearchstring(String str,char a){
        for(int i=0;i<str.length();i++){
            if(a==str.charAt(i)){

                return i;
            }
        }
        return -1;
    }
    //this function os going to print the boolean value if the character is found in the given string it returns tru or otherwise false
    public static boolean linearsearchstring2(String str,char a){
        for( char in: str.toCharArray()){
            if(in==a){
                return true;
            }
        }
        return false;
    }

}
