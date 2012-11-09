
public class Waiter {

	String name;
	double tips;
	
	public Waiter(String n){//The user provides the number
		name = n;
		tips = 0;//Initially the waiter has 0 tips
	}

	//Get the waiter's name
	public String getName(){
		return name;
	}
	
	//When a customer adds a tip, increment the total amount of tips
	public void addTip(double amount){
		tips += amount;
	}
	
	//Return the sum of the waiter's tips
	public double getTips(){
		return tips;
	}
	
	public void displayTips(){
		System.out.println("Total tips received for " + name + " is $" + tips);
	}
}
