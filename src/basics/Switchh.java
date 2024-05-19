package basics;

public class Switchh {
    public static void main(String[] args) {
        double[] ans={7};
        double anns=areaSwitchCase(1,ans);
        System.out.println(anns);
    }


        public static double areaSwitchCase(int ch, double []a) {
            // Write your code here
            double ans=0;
            switch(ch){
                case 1:
                {
                    ans=3.14*a[0]*a[0];
                    return ans ;
                }
                case 2:
                {
                    ans=a[0]*a[1];
                    return ans;
                }
            }
            return ans;

        }

}