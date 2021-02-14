
public class Rotation {
	public static void main(String args[]) {
		int Arr[] = {5, 1, 2, 3, 4};
		System.out.println(findKRotation(Arr,5));

	}

	static int findKRotation(int arr[], int n) {
       int min =arr[0]; int index=0;
	    
	    for(int i =0; i<n;i++){
	        if(min>arr[i]){
	            min = arr[i];
	            index = i;
	        }
	    }
	    return index;
    }
}