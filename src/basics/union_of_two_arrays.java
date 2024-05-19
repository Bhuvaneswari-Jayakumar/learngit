package basics;
import java.util.ArrayList;
import java.util.List;

public class union_of_two_arrays {
    public static void main(String[] args) {
        //10 4
        //3 3 4 5 6 7 8 9 9 9
        //2 4 10 10
        int[] a={3 ,3 ,4, 5, 6, 7, 8, 9, 9, 9};
        int[] b={2 ,4, 10, 10};
        int n=a.length,m=b.length,i=0,j=0;
        List<Integer> array=new ArrayList<>();
        while( i<n && j<m){
        if(a[i]<=b[j]){
            if(array.size()==0|| array.get(array.size()-1)!=a[i]){
                array.add(a[i]);
            }
            i+=1;
        }
        else{
            if(array.size()==0|| array.get(array.size()-1)!=b[j]){
                array.add(b[j]);
            }
            j+=1;
        }
    }
        while(i<n){
        if(array.get(array.size()-1)!=a[i]){
            array.add(a[i]);
        }
        i+=1;
    }
    while(j<m){
        if(array.get(array.size()-1)!=b[j]){
            array.add(b[j]);
        }
        j+=1;

}
        System.out.println(array);
}
}
