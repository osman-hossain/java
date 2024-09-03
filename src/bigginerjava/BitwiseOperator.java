package bigginerjava;

public class BitwiseOperator {
    public static void main(String[] args){
    int a = 32, b = 2, result;
    result = a & b; // a*b = 0
    System.out.println("Result = "+result);
    result = a | b; // a+b  = 44
    System.out.println("Result = "+result);
    result = a ^ b; // =44
    System.out.println("Result = "+result);
    result = a>>2;
    System.out.println("Result = "+result);
    result = a>>3;
    System.out.println("Result = "+result);
    result = b<<2;
    System.out.println("Result = "+result);
    result = b<<3;
    System.out.println("Result = "+result);


    }
}
