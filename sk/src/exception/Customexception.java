package exception;

class SException extends Exception{
	public SException(String string) throws SException{
		super(string);
	}
	
}
public class Customexception {
	public static void main(String[] args) {
		int i=10;
		int h;
		try {
			//h=i/0;
			throw new SException("s ex");
			
		}catch (SException e) {
			System.out.println("Eception - "+e);
		}
		
	}
	
	
		}
		
	













