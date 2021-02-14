
public class Fibonaccinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibp(11));
	}

	static int fibp(int N) {
		if (N <= 1) {
			return N;
		}
		return fibp(N - 1) + fibp(N - 2);
	}

	public int fib(int n) {
		if (n < 2)
			return n;

		int a = 0, b = 1, c = 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}