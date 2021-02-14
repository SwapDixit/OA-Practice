
public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 6, 7, 1 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		for(int i: arr)
			System.out.println(i);
	}

}
