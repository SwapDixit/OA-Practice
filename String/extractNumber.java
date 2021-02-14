
public class extractNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(number("abc99abc"));
	}

	static String number(String a) {
		String b = "";
		String out = "";
		for (int i = 0; i < a.length(); i++) {
			if (Character.isDigit((a.charAt(i)))) {
				b = b + a.charAt(i);
			} else {
				out = out + a.charAt(i);
			}
		}
		return out+(int) (Integer.parseInt(b)+(Integer.parseInt(b) * 0.1));
	}
}
