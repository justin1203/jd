import java.util.Random;
import java.util.Scanner;
public class restaurant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Waiter John = new Waiter();
		Waiter Alfred = new Waiter();
		Menu menu = new Menu();
		Bill bill = new Bill();

		int choice = 0;
		int order = 0;
		while(choice != 4){
			menu.printMenu();
			int num = rand.nextInt(2);
			Waiter myWaiter;
			if(num == 0)
				myWaiter = John;
			else
				myWaiter = Alfred;
			System.out.println("Your waiter is " + myWaiter);
			System.out.println("Please select a number:\n(1) Order an item" +
					"\n(2) View the bill\n(3) Pay the bill\n(4) Exit the restaurant\n");
			choice = scan.nextInt();
			if (choice == 1){
				System.out.println("Please choose an item from 1-10: ");
				order = scan.nextInt();
				bill.addItem(order-1);
				System.out.println("You selected " + menu.getMenu()[order-1].getName());
			}
			else if (choice == 2){
				bill.displayBill();
			}
			else if (choice == 3){
				double payment;
				double difference;//amount paid - remaining amount
				System.out.println("How much are you putting towards your bill?");
				payment = scan.nextDouble();
				
				difference = payment - bill.getTotal();
			}
			else if (choice == 4){
				
			}
		}
	}
}
