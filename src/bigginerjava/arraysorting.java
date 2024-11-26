package bigginerjava;

public class arraysorting {
    public static void main(String[] args){
        int[] num = {10,20,30,-5,2,5};
        int len = num.length;
        int p;
        int max;
        for(int j=0; j<len; j++){
            max = num[j];
            p=0;
            for(int i=j; i<len; i++){
                if(num[i]>max){
                    max = num[i];
                    p = i ;
                }
            }
            num[p]= num[j];

            num[j] = max;

            System.out.println(num[j]);
        }
    }
}
