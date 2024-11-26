package bigginerjava;
import java.util.Scanner;
public class UserPassword {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        String username = "alibanat@gmail.com";
//        String password = "ali.321@";
        String user,pass;
        while(true){
            System.out.print("Username/Email : ");
            user = input.nextLine();
            System.out.print("Password : ");
            pass = input.nextLine();
//            if(Objects.equals(user, username) && Objects.equals(pass, password)){
            if(user.equals("alibanat") && pass.equals("ali.321@")){
                System.out.println("Welcome to login page.");
            }
            else if(!user.equals("alibanat") && pass.equals("ali.321@")){
                System.out.println("incorrect username");
            }
            else if(user.equals("alibanat") && !pass.equals("ali.321@")){
                System.out.println("incorrect password");
            }
            else{
                System.out.println("Incorrect username or password");
            }

        }
    }

    public static class Assignment18 {

    }
}
