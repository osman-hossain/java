package bigginerjava;

public class AssignmentOperator {
    public static void main(String[] args){
        int x = 5,y =6;
        System.out.print(x+" * "+y+" = ");
        x *= y;
        System.out.printf("%d\n%d + %d",x,x,y);
        x += y;
        System.out.println(" = "+x);
        System.out.print(x+"-"+y);
        x -= y;
        System.out.println(" = "+x);
        System.out.print(x+"/"+y);
        x /= y;
        System.out.println(" = "+x);
        System.out.print(x+"%"+y);
        x %= y;
        System.out.println(" = "+x);
    }
}
