package bigginerjava;

public class lefttrianglle {
    public static void main(String[] args){
        int[][] num = new int[5][];
        int sum = 0;
        num[0] = new int[0];
        num[1] = new int[1];
        num[2] = new int[2];
        num[3] = new int[3];
        num[4] = new int[4];
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                num[i][j]= sum;
                System.out.print(sum+"\t");
                sum = sum+1;
            }
                System.out.print("\n");
        }
    }
}
