package bigginerjava;
import java.util.Scanner;
public class Assignment12 {
    //sum of odd numbers
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m, n, sum=0;
        System.out.println("Enter a starting number: ");
        m = input.nextInt();
        System.out.println("Enter a ending number: ");
        n = input.nextInt();
        for(int i = m; i <= n; i++){
            if(i%2!=0){
                System.out.printf("%d + %d = ",sum,i);
                sum = sum + i;
                System.out.println(sum);
            }
        }
        System.out.print("Sum of odd number is : "+sum);
    }
}
