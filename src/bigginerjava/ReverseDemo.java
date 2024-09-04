package bigginerjava;
import java.util.Scanner;
public class ReverseDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter number: ");
            int num = input.nextInt();
            int sum = 0,temp,rem,temp1;
            temp = num;

            while(temp!=0){
                rem = temp%10;
                System.out.printf("(%d * 10) + %d = %d\n",sum,rem,sum*10+rem);
                sum = (sum * 10) + rem;
                temp = temp/10;
            }
            System.out.println("Reverse of "+num+" is "+sum);
        }
    }
}
