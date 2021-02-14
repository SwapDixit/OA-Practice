import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/*
remove all punctuations
change to lowercase
words count for each word not in banned set
return the most common word
		
*/
public class mostcomonword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit" };

		System.out.println(mostCommon(paragraph, banned));

	}

	public static String mostCommon(String p, String[] banned) {
		Set<String> ban = new HashSet<>(Arrays.asList(banned));
		Map<String, Integer> count = new HashMap<>();
		String[] words = p.replaceAll("\\W+", " ").toLowerCase().split("\\s+");
		for (String w : words) {
			if (!ban.contains(w)) {
				count.put(w, count.getOrDefault(w, 0) + 1);
			}
		}

		// return Collections.max(count.entrySet(),
		// Map.Entry.comparingByValue()).getKey();
		int max = 0;
		String output = "";
		for (String str : count.keySet()) {
			if (count.get(str) > max) {
				max = count.get(str);
				output = str;
			}
		}
		return output;
	}

}
