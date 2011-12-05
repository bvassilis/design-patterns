package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements IVisitable {

	private String name;

	private List<IVisitable> orders = new ArrayList<IVisitable>();

	public void accept(IVisitor visitor) {
		visitor.visit(this);

		for (IVisitable order : orders) {
			order.accept(visitor);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public Customer(String name) {
		this.name = name;
	}

}
