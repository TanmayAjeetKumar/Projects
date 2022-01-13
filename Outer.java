
class Outer {
	class Inner{
		public void show() {
			System.out.println("in a nested class method");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer.Inner in=new Outer().new Inner();
		in.show();

	}

}
