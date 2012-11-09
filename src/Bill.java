import java.util.ArrayList;
import java.util.List;


public class Bill {

	private List<MenuItem> myList = new ArrayList<MenuItem>();
	Menu m = new Menu();

	public void addItem(int iNum){
		myList.add(m.menu[iNum]);
	}
}
