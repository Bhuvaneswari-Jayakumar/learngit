package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class gettingIntput {
        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            System.out.println(cars.size());
            System.out.println("Enter an integer:");
            Scanner in =new Scanner(System.in);
            int a=in.nextInt();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(a);

            System.out.println(cars);


        }
    }


