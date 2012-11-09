import java.util.ArrayList;
import java.util.List;


public class Bill {

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
}
