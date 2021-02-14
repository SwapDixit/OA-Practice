import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 6, 8, 22, 7, 6 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int x=8;
		int start = 0;
		int end = a.length - 1;
		int mid = start + (end - start) / 2;
		int i;

		if (a[mid] == x) 
           System.out.println(mid);
		
		
		
		
	}

}
