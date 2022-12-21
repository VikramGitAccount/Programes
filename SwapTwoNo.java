package p1;

public class SwapTwoNo {
    public static void main(String[] args) {

        int a =20, b = 12;
        // Value of first is assigned to temporary
        int temp = a;
        // Value of second is assigned to first
        a = b;
        // Value of temporary (which contains the initial value of first) is assigned to second
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


