package dsapractice;

public class Q2 {
	
	public  String sumExists(int[] num ,int target) {
		
		for(int i=0;i<num.length;i++) {
			for (int j = 0; j < num.length; j++) {
				if(num[i]+num[j]==target) {
					
				}
			}
		}System.out.println("done");
	
		return "not done";
		
	}

	public static void main(String[] args ) {
	int[] num = {9,-9,6};
	int target = 0;
	Q2 ni= new Q2();
	ni.sumExists(num, target);
	}

}
