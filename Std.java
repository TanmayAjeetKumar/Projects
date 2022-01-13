
class Std {
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}
class paramConstrDemo{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Std std1=new Std(52,"Tanmay");
		Std std2=new Std(53,"Tarun");
		std1.display();
		std2.display();

	}

}
