package bigginerjava;

public class ContinueOperator {
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            if(i==10){
                continue; // never go down back to for loop. on the other hand break stop work;
            }
            if(i==15){
                break;
            }
            System.out.println(i);
        }
    }
}
