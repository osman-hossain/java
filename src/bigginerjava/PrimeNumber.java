package bigginerjava;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        int start, end, count;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        start = input.nextInt();
        System.out.print("Enter ending number: ");
        end = input.nextInt();
        for(int j=start; j<=end; j++){
            count = 0;
            for(int i = 2; i<j; i++){
                if(j % i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                if(j==0 || j==1){
                    continue;
                }
                System.out.println(j);
            }

        }

    }
}
