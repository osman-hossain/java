package bigginerjava;

public class UnaryOperator {
    public static void main(String[] args){
        int x,result;
        x = 10;
        result = +x;
        System.out.println("Result = "+result);
        result = ++x;
        System.out.println("Result = "+result);
        result = +x;
        System.out.println("Result = "+result);
        result = --x;
        System.out.println("Result = "+result);
    }
}
