import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Merge2ArraySorted {

	public static void main(String[] args) {
		int a[] = { 6, 8, 22, 7, 6 };
		int b[] = { 1, 2, 3, 7 };
		System.out.println(Arrays.toString(merged(a, b)));
	}

	static int[] merged(int a[], int b[]) {
		int a_len = a.length;
		int b_len = b.length;
		int[] out = new int[a_len + b_len];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < a_len && j < b_len) {
			if (a[i] < b[j])
				out[k++] = a[i++];
			else
				out[k++] = b[j++];
		}

		while (i < a_len)
			out[k++] = a[i++];

		while (j < b_len)
			out[j++] = b[j++];

		return out;
	}

}
