package patterns;
/* out put is 
*
**
***
****
******/
public class Pattern1 {

	public static void main(String[] args) {
		
		int n = 6;
		
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
