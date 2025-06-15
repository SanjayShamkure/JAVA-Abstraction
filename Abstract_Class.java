package concept;

public abstract class Abstract_Class {// A class declared with "abstract" keyword is called abstract class.
	

	public static void m1(){
		
		System.out.println("static method m1 from abstract class");
	}
	
	public void m2() {
		
		System.out.println("Non static method m2 from abstract class");
	}
	
	public abstract void m3(); // can't use static keyword in abstract method

	
	public Abstract_Class(){ // we can create constructor in abstract class
		
		System.out.println("constructor from abstract class");
	}
	
}
