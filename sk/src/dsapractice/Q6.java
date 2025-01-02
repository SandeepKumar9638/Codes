package dsapractice;

public class Q6 {
	public static void main(String[] args) {
		
		String h = "maomtfugyhj";
		
		int i = 0,j=h.length()-1;
		boolean a=true;
		while (i<j) {
			if(h.charAt(i)!=h.charAt(j)) {
				a=false;
				break;
			}
			i++;
			j--;
		}
		if(a)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
}
