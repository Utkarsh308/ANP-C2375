class Shape{
	Object obj;
	Object getData(){
		return obj;
		
	}
	void putData(Object obj) {
		this.obj=obj;
}
public String toString() {
	return "I am Shape";
	
}
}
class Rectangle{
	public String toString() {
		return "I am rectangle";
	}
}
class Square{
	public String toString() {
		return"I am Square";
		
	}
}
class Triangle {
	public String toString() {
		return "I am Square";
		
}
	
}
public class SenericClassDemo{
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		Square square=new Square();
		Triangle triangle=new Triangle();
		Shape shape=new Shape();
		shape.putData(rectangle);
		Object obj=shape.getData();
		Rectangle rect=(Rectangle)obj;
		System.out.println(rect);
		
		shape.putData(square);
		Square sqr=(Square)shape.getData();
		System.out.println(sqr);
		shape.putData(triangle);
		Triangle tri=(Triangle)shape.getData();
		System.out.println(tri);
		
		
	}
}