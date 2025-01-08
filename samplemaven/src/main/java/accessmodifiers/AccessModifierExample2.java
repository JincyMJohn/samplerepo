package accessmodifiers;

public class AccessModifierExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierExample1 obj = new AccessModifierExample1(); //object reference for class - AccessModifierExample1
		obj.display(); //.display1() won't show as it is a private method.
		obj.display2();
		obj.display3();

	}

}
