package creational.builder;

public class Client {

	void createASCIIText(Document doc) {
		ASCIIConverterConcreteBuilder asciiBuilder = new ASCIIConverterConcreteBuilder();
		RTFReaderDirector rtfReader = new RTFReaderDirector(asciiBuilder);
		rtfReader.parseRTF(doc);
		ASCIITextProduct asciiText = asciiBuilder.getResult();
	}

	public static void main(String args[]) {
		Client client = new Client();
		Document doc = new Document();
		client.createASCIIText(doc);
		System.out.println("This is an example of Builder Pattern");
	}

}
