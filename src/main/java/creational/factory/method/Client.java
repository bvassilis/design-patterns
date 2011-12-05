package creational.factory.method;

public class Client {
	
	public static void main(String args[]){
		Factory factory = new ConcreteFactory();
		Document doc = factory.createDocument("html");
		doc.open();
		doc.save("index.html");
		doc.close();
	}

}
