package basics.java;

/**
 * Created by Georgi on 11/29/2014.
 */
public class RefPrimitiveTypes {
    public static void main(String[] args) {
        Integer myInt = null;
        myInt = 5;
        System.out.print("Стойност на myInt: ");
        System.out.println(myInt);

        myInt = null;
        System.out.print("Стойност на myInt: ");
        System.out.println(myInt);


//        int o = myInt.intValue(); //Ако о е Null методът intValuе поражда грешка
    }
}
