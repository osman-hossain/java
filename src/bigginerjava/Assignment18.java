package bigginerjava;
import java.util.Scanner;
public class Assignment18 {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){

        while(true) {
            System.out.print("Enter number: ");
            int num = input.nextInt();
            String[] days = {"","Monday", "Tuesday", "Wednesday", "Thursday", "Friday","saturday","sunday"};
//            for(String x:days){
//                if(days[(num+1)].equals(x)){
//                    System.out.println(x);
        //        }

//                for(int i = 1; i<= days.length; i++){
//                    if(i==num){
//                        System.out.println(days[i]);
//                    }
//            }
            System.out.println(days[num]);
//            for(String x: days){
//                System.out.println(x);
//            }
        }
        }
    }
}
