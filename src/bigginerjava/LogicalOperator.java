package bigginerjava;
import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<=5; i++){
            System.out.print("Enter alphabet: ");
            char alpha = input.next().charAt(0);
            if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u' ||
                alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O' || alpha=='U'){
                System.out.println("Vowel");
            }
            else{
                    System.out.println("Consonant");
                }
        }
    }
}
