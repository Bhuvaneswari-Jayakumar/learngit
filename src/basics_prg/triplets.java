package basics_prg;

import java.util.Arrays;

public class triplets {
    public static void main(String[] args) {

        //  4
        //1 5 3 2
        int arr[] = {1, 5, 3, 2};
        int n=4;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0;
        int k, j;
        for (int i = 0; i < n; i++) {
            j = i + 1;
            k = n - 1;
            while (j < k) {
                if (arr[j] + arr[k] == arr[i]) {
                    count += 1;
                    k -= 1;
                    j += 1;
                } else if ((arr[j] + arr[k]) < arr[i]) {
                    k -= 1;
                } else {
                    j += 1;
                }
            }
        }
    }
}
