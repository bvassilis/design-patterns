package creational.builder;

public class ASCIIConverterConcreteBuilder extends TextConverterBuilder {

	ASCIITextProduct asciiTextObj;// resulting product

	/*
	 * converts a character to target representation and appends to the
	 * resulting
	 */
	public void convertCharacter(char c) {
		char asciiChar = new Character(c).charValue();
		// gets the ascii character
		asciiTextObj.append(asciiChar);
	}

	void convertParagraph() {
	}

	ASCIITextProduct getResult() {
		return asciiTextObj;
	}

}
