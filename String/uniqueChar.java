
public class uniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(uniqueChar1("Google"));
	}

	static char uniqueChar1(String input) {
		if (input.isBlank() || input.isEmpty()) {
			return 0;
		}
		input.trim();

		boolean unique;

		for (int i = 0; i < input.length(); i++) {
			unique = true;
			for (int j = 0; j < input.length(); j++) {
				if (i != j && Character.toLowerCase(input.charAt(j)) == Character.toLowerCase(input.charAt(i))) {
					unique = false;
					break;
				}
			}

			if (unique) {
				return input.charAt(i);
			}
		}
		return 0;
	}
}