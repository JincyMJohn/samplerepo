package Inheritance;

public class Single_child extends Single_parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_child obj = new Single_child();
		obj.display();
		obj.display1();
	}
	public void display1() {
		System.out.println("This is single inheritance");
	}
}
