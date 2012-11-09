
public class User {

	private String iName;
	
	Bill currentBill = new Bill();
	
	public void chooseItem(String iName) {
		this.iName = iName;
		currentBill.addItem(iName);
	}
}
