package behavioral.visitor;

import java.util.ArrayList;

public class CustomerGroup {
	private ArrayList<IVisitable> customers = new ArrayList<IVisitable>();

	public void accept(IVisitor visitor) {
		for (IVisitable customer : customers) {
			customer.accept(visitor);
		}
	}

	public void addCustomer(IVisitable customer) {
		customers.add(customer);
	}
}
