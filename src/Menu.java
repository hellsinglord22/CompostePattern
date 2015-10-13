import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	// Attributes //
	private ArrayList menuComponents;
	private String name;
	private String description;

	/**
	 *
	 * @param name
	 *            the name of the menu
	 * @param description
	 *            a small description of the content of the menu
	 */
	public Menu(String name, String description) {
		menuComponents = new ArrayList();
		this.name = name;
		this.description = description;
	}

	/**
	 * @param menuComponent
	 *            a menu/sub-menu/menuItem to be added to the current menu
	 */
	public void add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);
	}

	/**
	 * @param menuCoponent
	 *            a men/sub-men/menuItem to be removed from the current menu
	 */
	public void remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}

	/**
	 *
	 * @param childNumber
	 *            the index of a child menu/menuItem to be returned
	 * @return the menu/menuItem to be returned
	 */
	public MenuComponent getChild(int childNumber) {
		return (MenuComponent) this.menuComponents.get(childNumber);
	}

	/**
	 * Getter
	 *
	 * @return the name of the current menu
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter
	 *
	 * @return a small description of the menu
	 */
	public String getDescription() {
		return this.description;
	}

	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			menuComponent.print();

		}

	}
}
