import java.util.Arrays;

public class sortedListMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 3, 7,12 };
	    int[] b = { 4, 8, 11 };
	    int[] c = merge(a,b);
	    System.out.println(Arrays.toString(c));
	    for (int i=0; i<c.length;i++ ) {
	    	System.out.println(c[i]);
	    }
	    }



	private static int[] merge(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int a_len=a.length, b_len=b.length;
		int apos = 0 ,bpos = 0,mergepos = 0;
		int[] merged  = new int [a_len+b_len];
		
		while(apos < a_len && bpos < b_len) {
			if(a[apos]<b[bpos]) {
				merged[mergepos]=a[apos];
				apos++;
			}else {
				merged[mergepos]=b[bpos];
				bpos++;
			}
			mergepos++;
		}
		
		while(apos < a_len) {
			merged[mergepos++]=a[apos++];
		}
		
		while(bpos < b_len) {
			merged[mergepos++]=b[bpos++];
		}
		
		return merged;
	}

}
