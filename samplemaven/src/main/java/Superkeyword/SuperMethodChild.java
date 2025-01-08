package Superkeyword;

public class SuperMethodChild extends SuperMethodParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj = new SuperMethodChild();
		obj.display1();
		
	}
	public void display1()
	{
		System.out.println("World");
		super.display(); //calling the display method in supermethodparent using super keyword
	
	}

}
