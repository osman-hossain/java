package bigginerjava;
public class practicalarray {
    public static void main(String[] args){
        int[][] num = new int[5][4];
        int sum=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                num[i][j] = sum;
                System.out.print(sum+"\t");
                sum++;
            }
            System.out.println();
        }
    }
}
