package creational.prototype;

public class Client {

	public static void main(String arg[]) {
		ConcretePrototype obj1 = new ConcretePrototype();
		ConcretePrototype obj2 = (ConcretePrototype) obj1.clone();
	}

}
