package bigginerjava;
import java.util.Scanner;
public class Series {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double n, sum=0;
        System.out.print("Enter ending number: ");
        n = input.nextDouble();
        for(double i=1.5; i<=n; i++){
//            System.out.printf("%.1f + %.1f = ",sum,i);
//            sum = sum+i;
//            System.out.printf("%.1f\n",sum);
            System.out.println(i);
        }
        System.out.println("Sum = "+sum);

    }
}
