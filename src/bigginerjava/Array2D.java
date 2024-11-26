package bigginerjava;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int num;
            String[][] number = new String[2][3];
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.printf("Enter %d.%d = ", i, j);
                    num = input.nextInt();
                    number[i][j] = String.valueOf(num);
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j <= 3; j++) {
                    System.out.printf("%d.%d = %d\n",i,j,number[i][j]);
                }
            }

        }
    }
}
