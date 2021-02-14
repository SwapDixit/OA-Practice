import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getChar("absba"));
	}

	static char getChar(String input) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);
			if (!map.containsKey(temp)) {
				map.put(temp, 1);
			} else if (map.containsKey(temp)) {
				map.put(temp, map.getOrDefault(map.get(temp), 1) + 1);
			}
		}

		for (char i : map.keySet()) {
			if (map.get(i) == 1) {
				System.out.println(i);
				return i;
			}
		}
		return '-';

	}

}
