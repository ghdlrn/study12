package java_20240201_6;

public class Example {
	public static void action(A a) {
		
		a.method1();
		if (a instanceof C) {
			C c = new C();
			c.method2();
			
		}
		
	}
	public static void main(String[] args) {
		action(new B());
		action(new C());
		
	
	}

}
