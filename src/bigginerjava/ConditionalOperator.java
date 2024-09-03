package bigginerjava;
import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,large;
        for(int i = 0; i<=5; i++){
            System.out.print("Enter first number: ");
            a = input.nextInt();
            System.out.print("Enter second number: ");
            b = input.nextInt();
            large = (a > b) ? a : b;
            System.out.println("large number is : "+large);
        }

    }
}
