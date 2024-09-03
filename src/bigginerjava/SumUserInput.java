package bigginerjava;
import java.util.Scanner;
public class SumUserInput {
    public static void main(String[] args){
        int num, sum = 0,sub = 0, mlt = 1;
        char operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Operator: ");
        operator = input.next().charAt(0);
        switch(operator){
            case '+':
                for(int i=0; i<=5; i++){
                    System.out.print("Enter number: ");
                    num = input.nextInt();
                    sum = sum+num;
                    System.out.println("sum = "+sum);
                }
                break;
            case '-':
                for(int i=0; i<=5; i++){
                    System.out.print("Enter number: ");
                    num = input.nextInt();
                    sub = sub-num;
                    System.out.println("subtract = "+sub);
                }
                break;
            case '*':
                for(int i=0; i<=5; i++){
                    System.out.print("Enter number: ");
                    num = input.nextInt();
                    mlt = mlt*num;
                    System.out.println("multiply = "+mlt);
                }
                break;
        }

    }
}
