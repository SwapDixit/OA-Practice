
public class FindSecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, -3, -5, 6, 6, 8 };
		System.out.println(getSecondMin(a));
	}

	static int getSecondMin(int[] arr) {
		int array_size = arr.length;
		if (arr.length == 0) {
			return -1; 
		}
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
		for (int i = 0; i < array_size; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}
		if (second == Integer.MAX_VALUE) {
			return 0;
		} else {
			return second;
		}
	}
}
