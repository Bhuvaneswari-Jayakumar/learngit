public class missingElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        int n = arr.length + 1;
        int[] hashing = new int[n];
        for (int i = 0; i < arr.length; i++) {
            hashing[arr[i]]++;

        }
        for (int i = 1; i < n; i++) {
            if (hashing[i] == 2) {
                System.out.println(i + " is repeating twice");
            } else if (hashing[i] == 0) {
                System.out.println(hashing[0]);
                System.out.println(i + " is missing");
            }

        }

    }
}
    class Solution {
        public static void main(String[] args) {
            int[] arr={1,2,1,3,5};
            int n=arr.length;
            int x= missingNumber(arr,n);
            System.out.println(x);
        }
      static int missingNumber(int array[], int n) {
            // Your Code Here

            long sn=n*(n+1)/2;
            long sn2=n*(n+1)*((2*n)+1)/6;
            long s=0,s2=0;
            for(int i=0;i<n;i++){
                s=s+array[i];
                s2=s2+(long)array[i]*(long)array[i];

            }
            long val1=s-sn;
            long val2=s2-sn2;
            val2=val2/val1;
            long x=(val1+val2)/2;
            return (int)x;
        }
    }

class GFG {

    // Function to find the missing number
    public static int getMissingNo(int[] nums, int n)
    {
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum = sum + nums[i];
        }
        return ((n * (n+1))/2 - sum);
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int N = arr.length+1;
        int n=getMissingNo(arr,N);
        System.out.println(n);
    }
}
class Solve {
    public static void main(String[] args) {
        int[] arr={1 ,3 ,3};
        int n=3;
        int[] n2=findTwoElement(arr,n);
        System.out.println(n2);
    }
   static int[] findTwoElement(int arr[], int n) {
        // code here
        long sum=0,sum2=0;
        long summation=(n*(n+1))/2;
        long summation2=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            sum2=sum2+(long)arr[i]*(long)arr[i];
        }
        long val1=summation-sum;//x-y 5-1=4 5-missing 1-repeating
        long val2=summation2-sum2;// x2-y2= 24  (x+y)(x-y)=24 x+y= 24/val1;
        val2=val2/val1;// x-y=4 x+y=24 24/4 =6

        long x=(val1+val2)/2;// x=6+4/2 10/2=5

        long y=x-val1;// y=5-4=1
        int[] ans = {(int)y, (int)x};
        return ans;
    }
}




