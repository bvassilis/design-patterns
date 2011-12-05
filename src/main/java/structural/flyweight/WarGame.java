package structural.flyweight;

public class WarGame {
	public static void main(String[] args) {
		// start war 
		
		// draw war terrain 
		
		// create 5 soldiers:
		SoldierClient warSoldiers [] ={
				new SoldierClient(),
				new SoldierClient(),
				new SoldierClient(),
				new SoldierClient(),
				new SoldierClient()
		};
		
		// move each soldier to his location 
		// take user input to move each soldier 
		warSoldiers[0].moveSoldier(17, 2112);
		
		// 	take user input to move each soldier 
		warSoldiers[1].moveSoldier(137, 112);
		
		// note that there is only one SoldierImp ( flyweight Imp)
		// for all the 5 soldiers 
		// Soldier Client size is small due to the small state it maintains
		// SoliderImp size might be large or might be small 
		// however we saved memory costs of creating 5 Soldier representations
	}
}
