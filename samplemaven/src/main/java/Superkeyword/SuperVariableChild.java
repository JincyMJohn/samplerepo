package Superkeyword;

public class SuperVariableChild extends SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj = new SuperVariableChild();
		obj.display();

	}
	String s = "World";
	public void display()
	{
		System.out.println(s);
		System.out.println(super.s);
	}
	

}
