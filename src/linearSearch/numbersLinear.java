package linearSearch;

import java.util.Scanner;

public class numbersLinear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=in.nextInt();
        System.out.println("enter the array elements:");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the element to be found");
        int element=in.nextInt();
        int ans=linear(arr,element);
        boolean ans1=linearsearch2(arr,element);
        System.out.println("found :"+ans1);
        if(ans==-1)
        System.out.println("element is not found");
                else{
            System.out.println("element is found in:"+ans+"position");
        }


    }
    //this function is going to print whether the number is present if it prints its index or return -1
    static int linear(int ar[],int ele){
        for(int i=0;i<ar.length;i++){
                if(ar[i]==ele){

                    return i;
            }
        }
    return -1;
    }
    //in this function it going to print the element present or not
    public static boolean linearsearch2(int ar[],int element){
        for(int elee:ar){
            if(elee==element){
                return true;
            }
        }
        return false;
    }
}
