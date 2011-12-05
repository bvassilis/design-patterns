package behavioral.strategy;

public class NormalBehaviour implements IBehaviour {
	
	public int moveCommand() {
		System.out.println("\tDefensive Behaviour: if find another robot run from it");
		return 1;
	}
	
}
