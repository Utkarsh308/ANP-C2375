package SwitchCaseDemo;

public class Demo {
	
	void start () {
		System.out.println("start");
	}
	void displayInstruction() {
		System.out.println("DisplayInstruction");
	}
	void exist() {
		System.out.println("exist");
		
	}
	public static void main (String[]args) {
		int mainInput=1;
		Demo demo1 = new Demo();
		demo1.start();
		demo1.displayInstruction();
		demo1.exist();
		System.out.println(mainInput);
		}

}
