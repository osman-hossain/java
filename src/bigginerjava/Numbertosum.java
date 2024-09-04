package bigginerjava;
import java.util.Scanner;
public class Numbertosum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int temp,sum = 0,num = input.nextInt();
        temp = num;

        while(temp!=0){
            int rem = temp%10;
            System.out.printf("%d + %d = %d\n",rem,sum,sum+rem);
            sum = sum+rem;
            System.out.println(sum);
            temp = temp/10;
        }
        System.out.printf("Sum of %d is %d",num,sum);
    }
}
