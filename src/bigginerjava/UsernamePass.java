package bigginerjava;
import java.util.Scanner;
public class UsernamePass {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       String username,password;
       while(true){
           System.out.print("username/email: ");
           username = input.nextLine();
           System.out.print("password: ");
           password = input.nextLine();

           if(username.equals("hamzaali@gmail.com") && password.equals("hamza.321@")){
               System.out.println("welcome to login page!");
           }
           else if(!username.equals("hamzaali@gmail.com") && password.equals("hamza.321@")){
               System.out.println("Invalid Username.");
           }
           else if(username.equals("hamzaali@gmail.com") && !password.equals("hamza.321@")){
               System.out.println("Invalid Password");
           }
           else{
               System.out.println("Invalid user name and password!");
           }

       }
   }
}