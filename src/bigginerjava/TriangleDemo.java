package bigginerjava;
import java.util.Scanner;
public class TriangleDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double base,height,triangle;
        System.out.print("Enter Base: ");
        base = input.nextInt();
        System.out.print("Enter Height: ");
        height = input.nextInt();
        triangle = base *height * 0.5;
        System.out.println("Area of Triangle = "+triangle);


    }
}
