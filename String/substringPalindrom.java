
public class substringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSubstring("abbabeae"));
	}

	private static boolean getSubstring(String input) {

		boolean ispalin = false;
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 2; j <= input.length(); j++) {
				// System.out.println("input substring "+i+" - "+j+input.substring(i,j));
				if (!(isPalin(input.substring(i, j)))) {
					ispalin = false;

				} else {
					ispalin = true;
					System.out.println("palindrome substring " + input.substring(i, j));
				}
				// System.out.println("ispalin "+ispalin);

			}

		}

		return ispalin;
	}

	private static boolean isPalin(String input) {

		char[] ch1 = input.toCharArray();
		boolean ispalin = false;
		int reverseCount = input.length() - 1;

		for (int i = 0; i < input.length(); i++) {
			// System.out.println("i "+i+ch1[i]);
			// System.out.println(" j "+reverseCount+ch1[reverseCount]);
			if (ch1[i] == ch1[reverseCount]) {
				reverseCount--;
				ispalin = true;
				// System.out.println("ispalin "+ispalin);
			} else {// System.out.println("ispalin "+ispalin);
				return false;
			}

		}

		return ispalin;
	}

}
