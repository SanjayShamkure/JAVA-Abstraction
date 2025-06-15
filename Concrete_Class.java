package concept;

public class Concrete_Class extends Abstract_Class  {
	
	
	@Override
	public void m3() {
		
	System.out.println("Abstract method m3 from abstract class");	
	
	}

	public static void main(String[] args) {
		
		Concrete_Class c = new Concrete_Class();
		
		c.m2();
		
		c.m3();
		
		Abstract_Class.m1();
		
		
		
	}
}
