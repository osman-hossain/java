package bigginerjava;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,num2;
        System.out.print("Enter start number: ");
        num = input.nextInt();
        System.out.print("\nEnter end number: ");
        num2 = input.nextInt();
        for(int j=num; j<=num2; j++){
            for(int i=1; i<=10; i++) {
                System.out.printf("%d X %d = %d\n", j, i, j * i);
            }
            System.out.println();
        }
    }
}
