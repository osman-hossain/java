package bigginerjava;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter row number: ");
            int row = input.nextInt();
            for(int i=1; i<row; i++){
                for(int j=1; j<=i; j++){
                    if(j%2==0){
                        System.out.print("0");
                    }else{
                        System.out.print("1");
                    }
                }
                System.out.println();
            }
        }

    }
}
