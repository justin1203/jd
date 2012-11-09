import java.util.ArrayList;
import java.util.List;


public class Bill {
	
	public Bill(){}
	
	final double HST = .12;//The Harmonized sales tax

	private List<MenuItem> myList = new ArrayList<MenuItem>();
	Menu m = new Menu();

	public void addItem(int iNum){
		myList.add(m.menu[iNum]);
	}

	public void displayBill(){
		for(int i = 0; i < myList.size(); i++){
			sum += myList.get(i).getPrice();
			System.out.println((myList.get(i)).getName() + ": $" + (myList.get(i).getPrice()));
		}
	}
	
	
}

