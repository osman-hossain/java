package bigginerjava;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char alpha;
        for(int i=0; i<=5; i++){
            System.out.print("Enter alphabet: ");
            alpha = input.next().charAt(0);

            switch(alpha){
                case 'a':
                    System.out.println("a for apple");
                    break;
                case 'b':
                    System.out.println("b for ball");
                    break;
                case 'c':
                    System.out.println("c for cat");
                    break;
                default:
                    System.out.println("couldn't found any word. please ignore it!");
            }
        }
    }
}
