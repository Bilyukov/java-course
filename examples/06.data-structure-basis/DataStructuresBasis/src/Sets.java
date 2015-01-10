import java.util.HashSet;


public class Sets {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Peter");
		set.add("Tosho");
		set.add("Peter");
		set.add("George");
		set.add("Maria");
		set.add("Alice");
		
		set.remove("Peter");
		
		System.out.println(set);

		System.out.println(set.contains("Maria"));
		
		System.out.println();
		
		for (String element : set) {
			System.out.println(element);
		}
		
		System.out.println();

	}
}