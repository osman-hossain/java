package bigginerjava;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] num = new double[5];
        double len = num.length;
        System.out.println(len);
        double sum = 0;
        for(int i=0; i<len; i++){// this len count from 0 to 5
            System.out.print("Enter num: ");
            num[i] = input.nextDouble();
            System.out.printf("%.1f + %.1f = %.1f\n",sum,num[i],sum+num[i]);
            sum = sum+num[i];
        }
        System.out.println("Total is : "+sum);
        System.out.println("Average number is: "+sum/len); // this len 5 doesn't count 0;
    }
}
