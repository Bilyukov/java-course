import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class TreeMap {

	public static void main(String[] args) {
		
		HashMap<String, ArrayList<Integer>> grades = new HashMap<>();
		grades.put("George", new ArrayList<>(Arrays.asList(5)));
		grades.put("Pete", new ArrayList<>(Arrays.asList(5, 5, 6)));
		grades.put("Alex", new ArrayList<>(Arrays.asList(5, 4, 4)));
		
		
		grades.get("Alex").add(6);
		grades.get("Pete").add(6);
		
		for (String key : grades.keySet()) {
			System.out.println("" + key + " -> " + grades.get(key));
		}

	}

}
