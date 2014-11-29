package basics.java;

/**
 * Created by Georgi on 11/29/2014.
 */
public class ArithmeticOps {
    public static void main(String[] args) {

        int x = 5;
        System.out.print("x = ");
        System.out.println(x);

        int y = 2;
        System.out.print("y = ");
        System.out.println(y);

        int c = x + y;
        System.out.print("x + y = ");
        System.out.println(c);

        c = x - y;
        System.out.print("x - y = ");
        System.out.println(c);

        c = x * y;
        System.out.print("x * y = ");
        System.out.println(c);

        c = x / y;
        System.out.print("integer x / y = "); //целочислено делене - резултатът е цяло число
        System.out.println(c);

        float d = (float) x / y;
        System.out.print("floating point x / y = "); //делене с плаваща запетая - резултатът е реално число
        System.out.println(d);

        c = x % y;
        System.out.print("x % y = ");
        System.out.println(c);

        x++;
        System.out.print("x++");
        System.out.println(x);

        y++;
        System.out.print("y++");
        System.out.println(y);
    }
}
