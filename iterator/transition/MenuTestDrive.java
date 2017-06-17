package headfirst.designpatterns.iterator.transition;
import java.util.ArrayList;

import headfirst.designpatterns.iterator.transition.client.Waitress;
import headfirst.designpatterns.iterator.transition.datastruct.DinerMenu;
import headfirst.designpatterns.iterator.transition.datastruct.PancakeHouseMenu;
import headfirst.designpatterns.iterator.transition.iterator.Menu;

public class MenuTestDrive {
	public static void main(String args[]) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();

	}
}
