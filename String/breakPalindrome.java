
public class breakPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(bkp("abaca"));
	}

	static String bkp(String input) {
		char[] ch = input.toCharArray();
		
		for(int i=0 ; i<=input.length()/2;i++) {
			if(ch[i]!='a') {
				ch[i]='a';
				return String.valueOf(ch);
			}
					
		}
		ch[input.length()-1] = 'b'; 
	     return input.length() < 2 ? "" : String.valueOf(ch);
	}

}
