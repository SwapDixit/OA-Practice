
public class consecutiveCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxPower("aasssdffffyyyyyyyyyy"));
	}

	public static int maxPower(String s) {
		int count = 0;
		int maxcount = 0;
		char prev = ' ';
		char repchar = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == prev) {
				count++;

			} else {
				count = 1;
				prev = s.charAt(i);
			}
			if (maxcount < count)
				repchar = s.charAt(i);
			maxcount = Math.max(maxcount, count);
		}
		System.out.println(repchar);
		return maxcount;
	}

}
