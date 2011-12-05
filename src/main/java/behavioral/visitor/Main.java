package behavioral.visitor;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c = new Customer("customer1");
		c.addOrder(new Order(".order1", "..item1"));
		c.addOrder(new Order(".order2", "..item1"));
		c.addOrder(new Order(".order3", "..item1"));

		Customer c2 = new Customer("customer2");
		Order o = new Order(".order_a");
		o.addItem(new Item("..item_a1"));
		o.addItem(new Item("..item_a2"));
		o.addItem(new Item("..item_a3"));
		c2.addOrder(o);
		c2.addOrder(new Order(".order_b", "..item_b1"));

		CustomerGroup customers = new CustomerGroup();
		customers.addCustomer(c);
		customers.addCustomer(c2);

		GeneralReport visitor = new GeneralReport();

		customers.accept(visitor);

		visitor.displayResults();
	}
}
