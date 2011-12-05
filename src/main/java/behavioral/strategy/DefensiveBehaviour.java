package behavioral.strategy;

public class DefensiveBehaviour implements IBehaviour {

	public int moveCommand() {
		System.out.println("\tNormal Behaviour: if find another robot ignore it");
		return 0;
	}

}
