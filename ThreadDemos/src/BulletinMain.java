
public class BulletinMain {
	
	public static void main(String[] args) {
		
		String bullet1[]= {"NationalNews1","NationalNews2","NationalNews3"};
		
		String bullet2[]= {"InterNationalNews1","InterNationalNews2","InterNationalNews3"};
		
		Thread t1=new Thread(new BulletinRunnable(bullet2),"international");
		
		Thread t2=new Thread(new BulletinRunnable(bullet1),"national");
		
		t1.start();
		t2.start();
		

}
}



