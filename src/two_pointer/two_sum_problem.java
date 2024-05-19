package two_pointer;

import java.util.HashMap;
import java.util.Scanner;

/*public class two_sum_problem {
    //      0 1 2 3 4
    //input-2,6,5,8,11 target-14
    //output-[1,3]
    public static void main(String[] args) {
        //
        System.out.println("enter the size of the array:");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the target element:");
        int target=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.println("when adding index "+i+" and index "+j+" in an array with get target element "+ target);
                }
            }
        }
        System.out.println("target element not found");
    }
}

 */
// optimized approach using hashMap
class twosum{
    public static void main(String[] args) {
        int[] arr=new int[2];
        HashMap<Integer,Integer> hash=new HashMap<>();
        arr[0]=arr[1]=-1;
        System.out.println("enter the size of the array:");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arrr[]=new int[n];
        for (int i=0;i<n;i++){
            arrr[i]=in.nextInt();
        }
        System.out.println("enter the target element:");
        int target=in.nextInt();
        for(int i=0;i<n;i++){
            int num=arrr[i];
            int neededmore=target-num;
            if(hash.containsKey(neededmore)){
                arr[0]=hash.get(neededmore);
                arr[1]=i;
                System.out.println("when adding index "+arr[0]+" and index "+arr[1]+" in an array with get target element "+ target );
            }
            hash.put(arr[i],i);

        }
        System.out.println("target element not found");
    }
}
