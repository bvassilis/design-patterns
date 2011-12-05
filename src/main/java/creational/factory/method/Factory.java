package creational.factory.method;

public abstract class Factory {
	
	public Document createDocument(String type) {
		if (type.equals("html"))
			return new HtmlDocument();
		else if (type.equals("proprietary"))
			return new MyDocument();
		else if (type.equals("pdf"))
			return new PdfDocument ();
		else return null;
	}
	
	public void newDocument(String type) {
	}
	
	public void openDocument(String filename) {
	}
	
}
