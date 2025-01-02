package justPrac;

public class Jp6 {

	public static void main(String[] args) {
		
		String[] arr= {"ramu","joy","hii","heaven","rom"};
		int length=0;
		String str=null;
		for(int i=0;i>=arr.length-1;i--) {
			 length = arr[i].length();
			 if(length==3) {
				 str=arr[i];
			 }
			
		}
		//if(length==3) {
			System.out.println(str);
	//	}
	}
}
