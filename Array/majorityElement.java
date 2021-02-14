
public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 4, 4, 6, 4 };
		System.out.println(majority(input));
	}

	static int majority(int[] input) {
		int count = 0;
		int maxcount = 0;
		int number = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					count++;
				}
			}
			if (maxcount < count)
				number = input[i];
			maxcount = Math.max(maxcount, count);
		}

		if (input.length / 2 <= maxcount) {
			System.out.println(number);
			return maxcount;
		} else
			return 0;

	}

}
