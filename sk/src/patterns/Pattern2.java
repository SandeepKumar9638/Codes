package patterns;
/*op is
 * ****
 * ****
 * ****
 * ****
 * 2nd op
 * *****
 * *****
 * *****
 */

public class Pattern2 {

	public static void main(String[] args) {
		//pat1(4);
		//(3,5);
	//}
		int n = 4,y=8;
	
	//static void pat1(int n) {
		for(int r=1;r<=n;r++) {
			for(int c= 1;c<=n;c++) {
				System.out.print("*");
			}
			System.out.println();
		}System.out.println("2nd");
//	}
	
	//static void pat2(int n,int y) {
		for(int r= 1;r<=n;r++) {
			for (int c=1;c<=y;c++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
