package creational.factory.abstracts;

public class ConcreteFactory1 extends AbstractFactory {
	
	public AbstractProductA createProductA() {
		return new ProductA1("ProductA1");
	}

	public AbstractProductB createProductB() {
		return new ProductB1("ProductB1");
	}

}
