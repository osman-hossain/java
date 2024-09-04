package bigginerjava;
import java.util.Scanner;
public class Revarse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,sum=0,temp,rem;
        while(true){
            System.out.print("Enter number: ");
            num=input.nextInt();
            temp=num;
            System.out.printf("%d reverse is ",num);
            while(temp!=0){
                rem = temp%10;
                System.out.printf("%d",rem);
                temp = temp/10;
            }
            System.out.println();
        }

    }
}
