package linearSearch;

import java.util.Scanner;

public class findElementInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = in.nextInt();
        System.out.println("enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the element to be found");
        int element = in.nextInt();
        System.out.println("enter the element in between range:");
        int start=in.nextInt();
        int end=in.nextInt();
        int ans = linear(arr,element,start,end);
        boolean ans1 = linearsearch2(arr, element);
        System.out.println("found :" + ans1);
        if (ans == -1)
            System.out.println("element is not found");
        else {
            System.out.println("element is found in:" + ans + "position");
        }


    }
    //this function is going to print whether the number is present if it prints its index or return -1 in between range
    static int linear(int ar[],int ele,int start,int end){
        for(int i=start;i<=end;i++){
            if(ar[i]==ele){

                return i;
            }
        }
        return -1;
    }
    //in this function it going to print the element present or not in between range
    public static boolean linearsearch2(int ar[],int element){
        for(int elee:ar){
            if(elee==element){
                return true;
            }
        }
        return false;
    }
}


