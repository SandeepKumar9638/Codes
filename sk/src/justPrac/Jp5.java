package justPrac;

interface Sum {
	
	int sum(int a ,int b);

}

class Jp5 
{
	public static void main(String[] args) {
		
		Sum sum = (a,b) ->(a+b);
		sum.sum(9,0);
	}
	
}
