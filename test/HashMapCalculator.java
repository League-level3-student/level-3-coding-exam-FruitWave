import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int matches = 0;
		for (String string1 : hashmap1.keySet()) {
			if (hashmap2.containsKey(string1)) {
				if (hashmap2.get(string1).equals(hashmap1.get(string1))) {
					matches++;
				}
			}
		}
		return matches;
	}

}
