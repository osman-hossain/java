package bigginerjava;

public class MathDemo {
    public static void main(String[] args){
        int a = 2, b = 3,c = 49;
        float d = 14.9f,e = 5.4f;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int absolute = Math.abs(b);
        double power = Math.pow(a, b);
        double sqrtRoot = Math.sqrt(c);
        int round  = Math.round(d);
        int round1 = Math.round(e);
        double floor = Math.floor(d);
        double ceil = Math.ceil(e);
        double pi = Math.PI;
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Absolute = "+absolute);
        System.out.println("Power = "+power);
        System.out.println("Square Root = "+sqrtRoot);
        System.out.println("Round one = "+round);
        System.out.println("Round two = "+round1);
        System.out.println("Floor = "+floor);
        System.out.println("Ceil = "+ceil);
        System.out.println("PI = "+pi);

    }
}
