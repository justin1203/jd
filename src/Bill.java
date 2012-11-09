import java.util.ArrayList;
import java.util.List;


public class Bill {
	
	List myList = new ArrayList();

	public void addItem(MenuItem iName){
		
	}
	
	public void displayBill(){
		for(int i = 0; i < myList.size(); i++){
			System.out.println((myList.get(i)).name + ": $" + (myList.get(i).price));
		}
	}
	
}
