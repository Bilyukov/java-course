package basics.java;

/**
 * Created by Georgi on 11/29/2014.
 */
public class StringType {
    public static void main(String[] args) {
        String firstName = "Георги ";
        String lastName = "Билюков";
        System.out.println("Здравей, " + firstName);

        String fullName = firstName + " " + lastName;
        System.out.println("Моето име е : " + fullName);
        System.out.println("Броят символи на името ми е : " + fullName.length());

        int number = 45;
        System.out.println("Нося " + number + " номер!");
    }
}
