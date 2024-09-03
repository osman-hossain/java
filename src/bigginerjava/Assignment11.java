package bigginerjava;
import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int factorial = 1, n;
        System.out.print("Enter a number: ");
        n = input.nextInt();
        for(int i=1; i<=n; i++){
            System.out.printf("%d * %d = ",factorial,i);
            factorial = factorial * i;
            System.out.println(factorial);
        }
        System.out.printf("Factorial of %d is %d",n,factorial);
    }
}
