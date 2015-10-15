import java.util.Iterator;

public class MenuItem extends MenuComponent {

	/// Attributes ///
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;

	/***
	 * @param name
	 *            the name of the item
	 * @param description
	 *            a small description of the item
	 * @param vegetarian
	 *            is the item contains meet or not
	 * @param price
	 *            the price of the item
	 */
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	/**
	 * @return the name of the item
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return a small description of the item
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return true of the item doesn't contain meat and false otherwise
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}

	/**
	 * @return the price of the item
	 */
	public double getPrice() {
		return price;
	}

	/// Custom methods ///
	/**
	 * print the information of the item
	 */
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());

	}

	public Iterator createIterator() {
		return new NullIterator();
	}

}
