
public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigit(337668));
	}

	static int sumDigit(int number) {
		int out = 0;
		int temp;
		while (number > 0) {
			temp = number % 10;
			out = out + temp;
			number = number / 10;
		}
		if (out > 9)
			out = sumDigit(out);
		return out;
	}

}
