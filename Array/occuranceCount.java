import java.util.HashMap;
import java.util.Map;

public class occuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 4, 6, 4,-7,-8,-7 };
		System.out.println(occCount(arr).entrySet());
	}

	static Map<Integer, Integer> occCount(int[] arr) {
		Map<Integer, Integer> out = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (out.containsKey(arr[i])) {
				out.put(arr[i], out.get(arr[i]) + 1);
			} else
				out.put(arr[i], out.getOrDefault(arr[i], 1));
		}
		return out;
	}
}
