package bigginerjava;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        int n, result=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = input.nextInt();
        for(int i=n; i>=1; i--){
            System.out.printf("%d * %d = ",i,result);
            result = result * i;
            System.out.println(result);
        }
        System.out.println("Total = "+result);
    }

}
