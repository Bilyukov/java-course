import java.util.Scanner;
import java.util.Arrays;


public class ArraysSorting {

	public static void main(String[] args) {
		
		System.out.println("Въведете размер на масива");
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.nextLine();
		scan.close();
		
		
		String[] words = new String[count];
		for (int i = 0; i < count; i++) {
			
			System.out.printf("Въведете дума номер %d \n", i + 1);
			
			words[i] = scan.nextLine();
		}
		
		// Сортиране
		Arrays.sort(words);
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

	}

}
