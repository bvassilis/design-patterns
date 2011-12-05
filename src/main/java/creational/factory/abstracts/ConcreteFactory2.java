package creational.factory.abstracts;

public class ConcreteFactory2 extends AbstractFactory {
	
	public AbstractProductA createProductA() {
		return new ProductA2("ProductA2");
	}

	public AbstractProductB createProductB() {
		return new ProductB2("ProductB2");
	}

}
