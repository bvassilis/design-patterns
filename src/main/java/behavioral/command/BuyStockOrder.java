package behavioral.command;

public class BuyStockOrder implements Order {
	private StockTrade stock;

	public BuyStockOrder(StockTrade st) {
		stock = st;
	}

	public void execute() {
		stock.buy();
	}

}
