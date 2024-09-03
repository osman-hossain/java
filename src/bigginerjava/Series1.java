package bigginerjava;
import java.util.Scanner;
public class Series1 {
    public static void main(String[] args){
        int n, sum= 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last number: ");
        n = input.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.printf("%d X %d = %d sum = ",i,i,i*i);
            sum = sum + i*i;
            System.out.println(sum);
        }
        System.out.print("Sum = "+sum);

    }

}
