import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class MapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> hm1=new HashMap<String,Integer>();
		hm1.put("Java",5);
		hm1.put("C++",2);
		hm1.put("Hibernet",3);

		HashMap<Integer,String> hm=new HashMap<>();


		hm.put(1,"AAA");
		hm.put(2,"BBB");
		hm.put(3,"CCC");


		hm.put(4,"DDD");
		System.out.println(hm);
		
		System.out.println(hm.toString());
		Set<Integer> keys=hm.keySet();
		Iterator<Integer> interator=keys.iterator();
		while(interator.hasNext()){
			Integer k=interator.next();
			System.out.println(k +" " +hm.get(keys));
		}
	}
}
