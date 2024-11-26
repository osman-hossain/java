package bigginerjava;

public class ForEach {
    public static void main(String[] args){
        String[] name = {"ali banat","hamza khan","kamal faruk","ashraf uddin"};
        for(String x: name){
            System.out.println(x);
        }
        int[] num = {10,20,30,50,70};
        int sum=0;
        for(int x: num){
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
