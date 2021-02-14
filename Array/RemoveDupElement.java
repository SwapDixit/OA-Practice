import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 23, 43, 6, 1 };

		Set<Integer> set = new LinkedHashSet<>();
		for (int i : a) {
			if (!set.contains(i)) {
				set.add(i);
			}
		}

		System.out.println(set.toString());

	}

}
