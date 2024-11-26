package bigginerjava;
import java.util.Arrays;
import java.util.Scanner;
public class MinimumNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // write a programme that print minimum number from array
        while(true){
            System.out.print("Enter the range of number: ");
            int range = input.nextInt();
            double[] num = new double[range];
            double len = num.length;
            double min;
            for(int i=0; i<len; i++){
                System.out.println("number: ");
                num[i] = input.nextDouble();
            }
            min = num[0];
            for(int i=1; i<len; i++){
                if(num[i]<min){
                    min=num[i];
                }
            }
            System.out.println(Arrays.toString(num) +" minimum number is: "+min);

        }
    }
}
