package bigginerjava;
import java.util.Scanner;
public class Logic2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<=5; i++){
            System.out.print("Enter alphabet: ");
            char alpha = input.next().charAt(0);
            if(alpha>='a' && alpha<='z'){
                System.out.println("Small letter!");
            }
            else if(alpha>= 'A' && alpha <= 'Z'){
                System.out.println("Capital letter!");
            }
            else{
                System.out.println("Not a letter!");
            }
        }
    }
}
