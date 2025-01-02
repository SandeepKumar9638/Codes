package patterns;

public class Pattern3 {

	public static void main(String[] args) {
	Pat(9);
	}
	static void Pat(int n) {
		for(int r=1;r<=n;r++) {
			for(int c=n;c>=r;c--) {
				System.out.print("*");
			}System.out.println();
		}
	}
}