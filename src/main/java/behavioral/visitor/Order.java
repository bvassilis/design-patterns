package behavioral.visitor;

import java.util.ArrayList;

public class Order implements IVisitable {

	private String name;

	private ArrayList<IVisitable> items = new ArrayList<IVisitable>();

	public Order(String name) {
		this.name = name;
	}

	public Order(String name, String itemName) {
		this.name = name;
		this.addItem(new Item(itemName));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);

		for (IVisitable item : items) {
			item.accept(visitor);
		}
	}

	public void addItem(Item item) {
		items.add(item);
	}

}
