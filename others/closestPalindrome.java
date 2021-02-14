
public class closestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(closestInt(16));

	}

	static int closestInt(int number) {
		int posnum = 0, negnum = 0;
		for (int i = number; i > 0; i++) {
			if (isPalindrome(i) == true) {
				posnum = i;
				break;
			}
		}
		for (int i = number; i > 0; i--) {
			if (isPalindrome(i) == true) {
				negnum = i;
				break;
			}
		}
		if (posnum - number <= number - negnum)
			return posnum;
		else
			return negnum;
	}

	static boolean isPalindrome(int number) {
		int palindrome = number; // copied number into variable
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		if (number == reverse) {
			return true;
		}
		return false;
	}

}
