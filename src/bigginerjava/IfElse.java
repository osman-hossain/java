package bigginerjava;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        for(int i=0; i<=5; i++){
            System.out.print("Enter a number between 0 to 9: ");
            num = input.nextInt();
            if(num>=0 && num<=9){
                if(num==0){
                    System.out.println("Zero");
                }
            if(num==1){
                System.out.println("one");
            }
            if(num==2){
                System.out.println("two");
            }
            if(num==3){
                System.out.println("three");
            }
            if(num==4){
                System.out.println("four");
            }
            if(num==5){
                System.out.println("five");
            }
            if(num==6){
                System.out.println("six");
            }
            if(num==7){
                System.out.println("seven");
            }
            if(num==8){
                System.out.println("eight");
            }
            if(num==9){
                System.out.println("nine");
            }
        }else{
            System.out.print("Invalid Number");
        }

        }
    }
}