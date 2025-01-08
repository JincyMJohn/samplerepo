package accessmodifiers;

public class AccessModifierExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierExample1 obj = new AccessModifierExample1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();

	}
	public void display()
	{
		System.out.println("Public");
	}
	private void display1()
	{
		System.out.println("Private");
	}
	protected void display2()
	{
		System.out.println("Protected");
	}
	void display3()
	{
		System.out.println("Default");
	}

}
