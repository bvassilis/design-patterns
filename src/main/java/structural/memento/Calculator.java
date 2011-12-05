package structural.memento;

public interface Calculator {
	// Create Memento
	public PreviousCalculationToCareTaker backupLastCalculation();

	// setMemento
	public void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

	// Actual Services Provided by the originator
	public int getCalculationResult();

	public void setFirstNumber(int firstNumber);

	public void setSecondNumber(int secondNumber);
}
