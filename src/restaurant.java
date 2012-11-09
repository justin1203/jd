import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class restaurant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Scanner scan = new Scanner(System.in);
			Random rand = new Random();
			Waiter John = new Waiter("John");
			Waiter Alfred = new Waiter("Alfred");
			Menu menu = new Menu();
			Bill bill = new Bill();

			int choice = 0;
			int order = 0;
			String fChoice = "y";
			
			while(true){
				int num = rand.nextInt(2);
				Waiter myWaiter;
				
				if(num == 0)
					myWaiter = John;
				else
					myWaiter = Alfred;
				
				System.out.println("\nPlease select a number:\n(1) Order an item" +
						"\n(2) View the bill\n(3) Pay the bill\n(4) Exit the restaurant\n");
				choice = scan.nextInt();
				
				if (choice == 1){
					System.out.println("Your waiter is " + myWaiter.getName());
					menu.printMenu();
					System.out.println("\nPlease choose an item from 1-10: ");
					order = scan.nextInt();
					if (order > 10){ System.out.println("We do not appreciate your attempts to destroy our business.  We must ask you to leave."); break;}
					bill.addItem(order-1);
					System.out.println("You selected " + menu.getMenu()[order-1].getName());
				}
				
				else if (choice == 2){
					bill.displayBill();
				}
				
				else if (choice == 3){
					double payment;
					double difference = 0;//amount paid - remaining amount
					double total = bill.getTotal();
					do{
						if(difference < 0)
							System.out.println("You still have some money to pay");
						System.out.println("How much are you putting towards your bill?");
						payment = scan.nextDouble();

						difference = payment - total;
						total -= payment;
						
					} while(difference < 0);
					System.out.println("The difference of what you paid and the total is given to the waiter as a tip");
					myWaiter.addTip(difference);
				}
				
				else if (choice == 4){
					John.displayTips();
					Alfred.displayTips();
					System.out.println("Thank you. Would you like to come again? (y/n)");
					fChoice = scan.nextLine();
					if (!fChoice.equals("y")) break;
				}
			}
		}catch(InputMismatchException e){
			System.out.println("We do not appreciate your attempts to destroy our business.  We must ask you to leave.");
		}
	}
}
