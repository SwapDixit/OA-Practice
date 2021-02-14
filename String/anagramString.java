
import java.util.HashSet;
import java.util.*;

public class anagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("geeksforgeeks", "forgeeksgeeks"));
	}

	static boolean isAnagram(String a, String b) {
		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();
		
		if (ch1.length == ch2.length) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}

			}
		} else {
			return false;
		}

		return true;
	}
}
