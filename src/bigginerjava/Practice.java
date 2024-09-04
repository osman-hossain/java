package bigginerjava;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num,rem,sum=0;
        while(temp!=0){
            rem= temp%10;
            System.out.printf("%d + %d = %d\n",sum,rem,sum+rem);
            sum = sum+rem;
            temp = temp/10;
        }
        System.out.println("sum of "+num+" is "+sum);
    }
}