import java.util.HashMap;
import java.util.Set;

public class HashMaps {
	
	
	public static void main(String[] args) {
		String[] words = { 
			"да", "здравей", "дума", "черно", "червено", "не", "червено",
			"да", "мрежа", "червено", "заек", "червено",
			"мрежа", "програмиране", "червено", "дума", "черно"
		};
		
		HashMap<String, Integer> wordsCount = 
				new HashMap<String, Integer>();
				
		for (String word : words) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count+1);
		}
		
		System.out.println(wordsCount);
		
		
		Set<String> wordKeys = wordsCount.keySet();
		
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			System.out.printf("%s -> %d пъти\n", word, count);
		}		
	}
}
