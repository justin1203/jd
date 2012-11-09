/**
 *
 * @author Drew Ingram 16680076
 *
 */
public class Menu {
	MenuItem[] menu;
	public Menu(){
		menu = new MenuItem[10];
		menu[0] = new MenuItem("#1 Chicken Fries", 10.21);
		menu[1] = new MenuItem("#2 Bull Testicle", 3.99);
		menu[2] = new MenuItem("#3 New York Steak", 23.99);
		menu[3] = new MenuItem("#4 Stir Fry", 4.12);
		menu[4] = new MenuItem("#5 Stir Fry with Bull Tesitcle", 5.99);
		menu[5] = new MenuItem("#6 Sushi", 5.13);
		menu[6] = new MenuItem("#7 Mozzarella Sticks", 2.98);
		menu[7] = new MenuItem("#8 Dumplings", 6.38);
		menu[8] = new MenuItem("#9 Calamari", 12.99);
		menu[9] = new MenuItem("#10 Pork Chops", .12);
	}

	public MenuItem[] getMenu(){
		return menu;
	}

	public void printMenu(){
		System.out.println("Menu: ");
		for(int i = 0; i < menu.length; i ++){
			System.out.println(menu[i].getName() + " $" + menu[0].getPrice());
		}
	}

}