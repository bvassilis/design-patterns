package behavioral.strategy;

public class Robot {

	IBehaviour behaviour;
	String name;

	public Robot(String name) {
		this.name = name;
	}

	public void setBehaviour(IBehaviour behaviour) {
		this.behaviour = behaviour;
	}

	public IBehaviour getBehaviour() {
		return behaviour;
	}

	public void move() {
		System.out.println(this.name + ": Based on current position" + "the behaviour object decide the next move:");
		int command = behaviour.moveCommand();
		// ... send the command to mechanisms
		System.out.println("\tThe result returned by behaviour object " + "is sent to the movement mechanisms " + " for the robot '" + this.name + "'");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
