
public interface Calculations {
int calcSquare(int x);

default void display() {
	System.out.println("default diplay method");
}
static String greet() {
	return("static greet method");
}


}
