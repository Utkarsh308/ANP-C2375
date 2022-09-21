
public class Bulletin {
public void postBulletin(String bulletpoint[]) {
	for(String bullet:bulletpoint){
		System.out.println(bullet);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
}
