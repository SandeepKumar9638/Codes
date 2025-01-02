package justPrac;

public class Jp1 {

	public static void main(String[] args) {
		String str = "dope";
		char[] cha = str.toCharArray();
		for (int i = cha.length - 1; i >= 0; i--) {
			System.out.print(cha[i]+" ");
		}
		System.out.print("\n"); 

		System.out.println("ap2");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		
		StringBuilder sb1= new StringBuilder(str);
		System.out.println(sb1.reverse());
		
		
	}

}
