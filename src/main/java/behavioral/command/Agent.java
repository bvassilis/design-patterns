package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Agent {
	private List<Order> ordersQueue = new ArrayList<Order>();

	public Agent() {
	}

	void placeOrder(Order order) {
		ordersQueue.add(order);
		ordersQueue.remove(0);
		order.execute();
	}
}
