
public abstract class Item {
	private int identificationnumber;
	private String title;
	private int numberOfCopies;
	Item(){

    }
     void displayItem(int idnum, String title,int numcopies) {
	     this.identificationnumber = idnum;
	     this.title = title;
	     this.numberOfCopies = numcopies;
}
	public int getIdentificationnumber() {
		return identificationnumber;
	}
	public void setIdentificationnumber(int identificationnumber) {
		this.identificationnumber = identificationnumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
}
