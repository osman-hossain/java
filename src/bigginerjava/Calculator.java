package bigginerjava;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,sum=0, sub=0, multi=1,result=0;
        char operator;
        for(int i=1; i<=5; i++){
            System.out.print("Enter operator: ");
            operator = input.next().charAt(0);
            switch(operator){
                case '+':
                    System.out.print("add: ");
                    num = input.nextInt();
                    result = result+num;
                    System.out.println("result = "+result);
                    break;
                case '-':
                    System.out.print("Enter number: ");
                    num = input.nextInt();
                    result = result-num;
                    System.out.println("result = "+result);
                    break;
                case '*':
                    System.out.print("Enter number: ");
                    num = input.nextInt();
                    result = result*num;
                    System.out.println("result = "+result);
                    break;
                case '/':
                    System.out.print("Enter number: ");
                    num = input.nextInt();
                    result = result/num;
                    System.out.println("result = "+result);
                    break;
                case '%':
                    System.out.print("Enter number: ");
                    num = input.nextInt();
                    result = result%num;
                    System.out.println("result = "+result);
                    break;
            }
        }

    }
}
