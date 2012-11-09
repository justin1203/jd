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
		
		
		int choice = 1;
		while(choice >= 1){
			int num = rand.nextInt(2);
			Waiter myWaiter;
			if(num == 0)
				myWaiter = John;
			else
				myWaiter = Alfred;
		}
	}
}
