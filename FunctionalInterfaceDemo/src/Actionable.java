
public interface Actionable {
	
	void jumpAction();
	void fightAction();
	

	default void display2() {
		System.out.println("default diplay method");
	}
	
	
	
	default void display1() {
		System.out.println("default diplay method");
	}
	static String greet() {
		return("static greet method");
	}
	static String greet1() {
		return("static greet method");
	}

}
