import java.util.ArrayList;
import java.util.List;


public class Bill {
	
	public Bill(){}
	
	final double HST = .12;//The Harmonized sales tax

	private double total = 0;
	private int count = 0;
	private List<MenuItem> myList = new ArrayList<MenuItem>();
	Menu m = new Menu();

	public void addItem(int iNum){
		myList.add(m.menu[iNum]);
		count++;
	}

	public void sum(){
		for(int i=0;i<count;i++){
			total += myList.get(count).getPrice();
		}
	}

	public void displayBill(){
		for(int i = 0; i < myList.size(); i++){
			sum += myList.get(i).getPrice();
			System.out.println((myList.get(i)).getName() + ": $" + (myList.get(i).getPrice()));
		}
	}
	
	
}

