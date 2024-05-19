 class thirdLargest {
     public static void main(String[] args) {
         int[] arr={884,337 ,689, 587, 748, 308, 451, 785, 682, 600, 733, 537, 403, 188, 162, 562, 274, 513 ,383, 617 ,662 ,508, 111 ,57 ,160};
         int n=thirdLargest(arr,25);
         System.out.println(n);
     }

        static int thirdLargest(int a[], int n){

            // Your code here
            // 2 4 1 3 5
            // 4>2,
            int firstLargest=a[0];
            int secondLargest=a[0];
            int thirdLargest=-1;
            for(int i=0;i<n;i++){
                // 4>2
                if(a[i]>firstLargest){ // 1>4, 5>4
                    thirdLargest=secondLargest;// 2=2 , 2=2
                    secondLargest=firstLargest;// 2=2 , 2=4
                    firstLargest=a[i];// 2=4, 4=5

                }
                else if( a[i]< firstLargest && a[i]>secondLargest){
                    thirdLargest=secondLargest;
                    secondLargest=a[i];
                }
                else if(a[i]<secondLargest && a[i]> thirdLargest)
                    thirdLargest=a[i];
                }
        return thirdLargest;
        }
        }




