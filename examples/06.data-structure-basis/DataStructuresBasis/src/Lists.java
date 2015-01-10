import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lists {

	public static void main(String[] args) {
		
		ArrayList<String> people = new ArrayList<String>();
		
		people.add("Иван");
		people.add("Катерина");
		people.add("Атанас");
		people.add("Тодор");			
		
		people.add("Георги"); 
		people.remove(0);
		people.remove(1);
		people.remove("Тодор");
		people.addAll(Arrays.asList("Теодора", "Мариан")); 
		people.add(3, "Силвия"); 
		people.set(2, "Михаил");
		
		System.out.println(people);
		
		for (String name : people)
		{
		    System.out.println(name);
		}
		
		
//		 Не може да се използва примитивен тип
//		ArrayList<int> intArr = new ArrayList<int>();
		
		
		List<Integer> numbers = Arrays.asList(5, -3, 10, 25);
		
		ArrayList<Integer> nums = new ArrayList<Integer>(numbers);
		
		nums.add(55);
		System.out.println(nums.get(0));
		System.out.println(nums);
		nums.remove(2);
		nums.set(0, 101);
		System.out.println(nums);
		
		nums.add(5);
		nums.add(15);
		
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}

	}

}