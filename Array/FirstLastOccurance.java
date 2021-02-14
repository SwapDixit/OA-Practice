import java.util.Arrays;
import java.util.Iterator;

public class FirstLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 4, 5, 5, 6, 6 };
		System.out.println(Arrays.toString(getOccurance(a, 5)));
	}

	static int[] getOccurance(int[] arr, int num) {
		int start = -1, end = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				start = i;
				break;
			}
		}

		if (start == -1) {
			return new int[] {start, end };
		}

		for (int j = arr.length - 1; j >= 0; j--) {
			if (arr[j] == num) {
				end = j;
				break;
			}
		}
		return new int[] { start, end };
	}
}
