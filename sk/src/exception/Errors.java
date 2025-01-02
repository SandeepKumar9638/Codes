package exception;
class sandeepException extends Exception{
	public sandeepException(String string) {
		super("hgyg");
	}
}

public class Errors {
	public static void main(String[] args) {
		int a = 10;
		int h = 50;
		int j;
		String[] str = new String[2];
		 String n =null;
		try {
			j=a/h;
			System.out.println(j);
			if(j==0)
				throw new sandeepException("hi here");
			

		} catch (Exception e) {

			// e.printStackTrace();
			System.out.println("wrong" + "\n" + e);
		} 
	}
	

}
