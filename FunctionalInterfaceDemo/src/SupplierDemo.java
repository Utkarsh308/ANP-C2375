import java.util.function.Supplier;
public class SupplierDemo {

	public static void main(String[] args) {
	Supplier<String> supplierString=()->"Supplier String";
	String str=supplierString.get();
	Supplier<Integer> supplierIntg=()->12;
    int i=supplierInt.get();
    
    Supplier<MyCalculations> supplierMyCalc=()->{return new MyCalculation();
    		MyCalculations myCal=supplierMyCalc.get();
    }	
	
	
}
