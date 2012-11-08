
public class MenuItem {
	
	private String name;
	private double price;
	
	public MenuItem(String n, double p){
		name = n;
		price = p;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}
}
