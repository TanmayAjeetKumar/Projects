
public class StringBuffers {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Tanmay");
		int p=s.length();
		
		int q=s.capacity();
		
		System.out.println("length of string Tanmay" +p);
		
		System.out.println("Capacity of string Tanmay" +q);
	}

}
