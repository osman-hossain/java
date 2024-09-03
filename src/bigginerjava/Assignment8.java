package bigginerjava;
import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<=5; i++){
            System.out.println("have you completed your masters?y/n");
            char qus1 = input.next().charAt(0);
            System.out.println("are you fluent in english?y/n");
            char qus2 = input.next().charAt(0);
            if((qus1=='y' || qus1=='Y') && (qus2=='y' || qus2=='Y')){
                System.out.println("You have Passed!");
            }
            else if((qus1=='n' || qus1=='N') && (qus2=='n'||qus2=='N')){
                System.out.println("Sorry. You are not eligible for the job interview.");
            }
            else if((qus1=='y' || qus1=='Y') && (qus2=='n'||qus2=='N')){
                System.out.println("Sorry. You are not eligible for the job interview.");
            }
            else if((qus1=='n' || qus1=='N') && (qus2=='y'||qus2=='Y')){
                System.out.println("Sorry. You are not eligible for the job interview.");
            }
            else{
                System.out.println("You have entered invalid letter!");
            }
        }

    }
}
