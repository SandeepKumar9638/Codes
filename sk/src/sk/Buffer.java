package sk;

public class Buffer {
	
	public  Object Test(){
		
		String s = "Java";
		for(int i = 0;i<10000;i++) {
			s=s+"in";
		}
		return s;
	}
	
	  public static String Vn(){
	  
	  StringBuffer sb = new StringBuffer("java");
	  
	  for(int i=0;i<10000;i++) { sb.append("in");
	  
	  } return sb.toString(); }
	 
		
	public static void main(String[] args) {
		Buffer b=new Buffer();
		
		long x=System.currentTimeMillis();
		b.Test();
		System.out.println("test "+(System.currentTimeMillis()-x));
		x=System.currentTimeMillis();
		Vn();
		System.out.println("vnte "+(System.currentTimeMillis()-x));
		System.out.println("-------------------------------");
		/*String str= "sandeep";
		System.out.println(str.hashCode());
		str = str+"kumar";
		
		System.out.println(str.hashCode());
		
		StringBuffer sb1= new StringBuffer("sandeep");
		System.out.println(sb1.hashCode());
		sb1.append("kumar");
		
		System.out.println(sb1.hashCode());*/

		/*
		 * StringBuffer sb= new StringBuffer();
		 * 
		 * System.out.println(sb.capacity()); sb.append("hello");
		 * System.out.println(sb.capacity()); sb.append(" this is sass");
		 * System.out.println(sb.capacity()); sb.ensureCapacity(40);
		 * System.out.println(sb.capacity());
		 * 
		 * sb.setCharAt(1, 'e'); sb.deleteCharAt(2); sb.setLength(5);
		 * 
		 * System.out.println(sb); System.out.println(sb.capacity()); sb.setCharAt(1,
		 * 'e'); System.out.println(sb);
		 * 
		 * System.out.println(sb.charAt(2)); System.out.println(sb.length());
		 * System.out.println(sb.hashCode()); System.out.println(sb.reverse());
		 * System.out.println(sb.replace(0, 3, "jhan"));
		 * System.out.println(sb.indexOf("e")); System.out.println(sb.isEmpty());
		 * System.out.println(sb.getClass()); StringBuffer h =sb.append(" sandeep");
		 * System.out.println(h); System.out.println(h.capacity());
		 */
	}
}
