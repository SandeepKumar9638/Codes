package justPrac;

class Jp2 {
	static B b;
	
	public static void main(String[] args) {
		B p = new B();
		//B name = new B();
		//p.f1();
		p.f2();
		p.f1();
	//	name.f1();
		System.out.println(b.k);
	}
	

}

class B{
	
	static int k = 10;
	public static  void f1() {
		System.out.println("hi");
	}
	public void  f2() {
		System.out.println("ok");
	}
}