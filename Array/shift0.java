import java.util.Arrays;

public class shift0 {

	public static void main(String[] args) {
		int[] arr = { 0, 8, 9, 0, 0, 9, 8, 0 };
		int n = arr.length;
		pushZeroesToEnd(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println(Arrays.toString(moveZero(arr)));
	}

	static int[] moveZero(int[] a) {
		int anchor = 0;
		for (int explorer = 0; explorer < a.length; explorer++) {
			if (a[explorer] != 0) {
				int temp = a[anchor];
				a[anchor] = a[explorer];
				a[explorer] = temp;

				anchor++;
			}
		}
		return a;
	}

	static void pushZeroesToEnd(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < n) {
			arr[count++] = 0;
		}
	}
}
