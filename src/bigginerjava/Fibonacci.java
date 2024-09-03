package bigginerjava;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, num1=0,num2=1, fibonacci;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        for(int i = 1; i<=num; i++){
            System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
            fibonacci = num1 + num2;
            num1 = num2;
            num2 = fibonacci;
        }
        System.out.println("Fibonacci = "+num2);
    }
}
