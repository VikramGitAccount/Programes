package p1;

public class SwapWithoutUseTemp{
    public static void main(String[] args) {

        int a = 10, b = 24;

        a = a - b;
        b = a + b;
        a = b - a;
        
        System.out.println("after swap :");
        System.out.println("a = " + a);
        System.out.println("b = " +b);
    }
}