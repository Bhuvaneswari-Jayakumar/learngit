package linearSearch;

import java.util.Arrays;

public class searchElementIn2Darray {
    public static void main(String[] args) {


    int[][] arr = {{1, 2, 3}, {2, 3, 4}, {2, 4, 3}};

    int ans=searchelement(arr);
        System.out.println(ans);
}

    public static int searchelement(int[][] arr){
       int max=arr[0][0];
        for(int i=0;i<arr.length;i++ ){
            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}

