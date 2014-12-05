
public class Arrays {

	public static void main(String[] args) {
		
		int[] numbers = new int[12];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;

		for (int i = 4; i < numbers.length; i++) {
		    numbers[i] = i+1;
		}
		
		for (int i = 0; i<numbers.length; i++) {
			System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
		}
		
		System.out.println();
		
		String[] names = { "Peter", "Maria", "Katya", "Todor" };
		
		for (int i = 0; i<names.length; i++) {
			System.out.printf("names[%d] = %s\n", i, names[i]);
		}
		
		System.out.println();
		
		String academy = "IT Academy";
		
		for (int i = 0; i < academy.length(); i++) {
			char symbol = academy.charAt(i);
			System.out.printf("Символ с индекс %d : %s", i, symbol);
			System.out.println();
		}
		
		System.out.println();
		
		char[] academyArray = academy.toCharArray();
		
		for (int i = 0; i < academyArray.length; i++) {
			System.out.printf("Индекс %d : %s", i, academyArray[i]);
			System.out.println();
		}

	}

}
