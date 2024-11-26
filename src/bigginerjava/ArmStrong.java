package bigginerjava;
import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            int start,end,sum,temp,rem,count=0;
            System.out.print("Enter number: ");
            start = input.nextInt();
            System.out.print("Enter number: ");
            end = input.nextInt();

            for(int i=start; i<=end; i++){
                temp=i;
                sum=0;
                while(temp!=0){
                    rem=temp%10;
//                    System.out.printf("%d*%d*%d+%d = ",rem,rem,rem,sum);
                    sum = sum+rem*rem*rem;
//                    System.out.println(sum);
                    temp = temp/10;
                }
                if(sum==i){
                    System.out.printf("Number %d is Armstrong %d\n",sum,i);
                    count++;
                }
//                else{
//                    System.out.println("not Armstrong");
//                }

            }
            System.out.println("Total = "+count);

        }
    }
}
