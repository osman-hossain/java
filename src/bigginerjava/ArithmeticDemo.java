package bigginerjava;
import java.util.Scanner;
public class ArithmeticDemo {
    public static void main(String[] args){
        int num1, num2, add, subtract, multiply, remainder,divide ;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        num2 = in2.nextInt();
        add = num1+num2;
        subtract = num1-num2;
        multiply = num1*num2;
        remainder = num1%num2;
        divide = num1/num2;
        System.out.println("sum = "+add);
        System.out.println("subtraction = "+subtract);
        System.out.println("multiply = "+multiply);
        System.out.println("remainder = "+remainder);
        System.out.print("divide = "+divide);

//        int num3, num4, result1;
//        Scanner in3 = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        num3 = in3.nextInt();
//        Scanner in4 = new Scanner(System.in);
//        System.out.print("Enter the second number: ");
//        num4 = in4.nextInt();
//        result1 = num3-num4;
//        System.out.print("Answer is : "+result1);
    }
}
