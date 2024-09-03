package bigginerjava;
import java.util.Scanner;
public class inputdemo {
    public static void main(String[] args){
        int num ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.println("Result is : "+num);

        Scanner inpu = new Scanner(System.in);
        String name ;
        System.out.print("Enter a name: ");
        name = inpu.nextLine();
        System.out.println("name = "+name);

        Scanner doble = new Scanner(System.in);

        double dl;
        System.out.print("Enter a double number : ");
        dl = doble.nextDouble();
        System.out.print(dl);
        char firstName = input.next().charAt(0);


    }
}
