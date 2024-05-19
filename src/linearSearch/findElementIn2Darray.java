package linearSearch;

import java.util.Arrays;

public class findElementIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {2, 4, 3}};
        int target = 2;
        int[] ans=searchelement(arr,target);
        System.out.println(Arrays.toString(ans));
    }
        public static int[] searchelement(int[][] arr,int target){

        for(int i=0;i<arr.length;i++ ){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
