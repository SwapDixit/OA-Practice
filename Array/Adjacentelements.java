import java.util.Arrays;

public class Adjacentelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 6, 8,22,7, 6 };
		System.out.println(Arrays.toString(adj(a)));
	}

	static int[] adj(int A[]) {
		int out[] = { -1, -1 };
		for (int i = 0; i < A.length - 1; i++) {
			int a = Math.abs(A[i]);
			int b = Math.abs(A[i + 1]);
			if (a - b == 1 || b - a == 1) {
				out[0] = a;
				out[1] = b;
				return out;
			}
		}
		return out;
	}
}
