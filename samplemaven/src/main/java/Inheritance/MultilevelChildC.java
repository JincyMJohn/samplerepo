package Inheritance;

public class MultilevelChildC extends MultilevelParentB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChildC obj = new MultilevelChildC();
		obj.display();
		obj.display1();
		obj.display2();

	}
	public void display2()
	{
		System.out.println("Child");
		
	}

}
