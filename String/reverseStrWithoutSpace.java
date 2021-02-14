public class reverseStrWithoutSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revs("ab cb  mkks"));
		System.out.println(reverse("My name is Swapnil"));
	}

	private static String reverse(String input) {
		int spcCount = 0;
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(spcCount) == ' ') {
				output += input.charAt(spcCount);
				i = i + 1;
			} else if (input.charAt(i) != ' ') {
				output += input.charAt(i);

			} else {
				output += input.charAt(i - 1);
				i = i - 1;
			}
			spcCount++;
		}
		return output;
	}

	public static String revs(String s) {
		String out = "";
		int j = s.length() - 1;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				while (!Character.isLetter(s.charAt(j)))
					j--;
				out = out + s.charAt(j--);
			} else {
				out = out + s.charAt(i);
			}
		}

		return out;
	}

}
