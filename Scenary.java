import java.util.Scanner;

public class Scenary {
	public int state = 1;
	public int round = 1;
	public void turn() {
		if (state == 1) {
			System.out.println("\nFirst player turn");
			state++;
		}
		else {
			System.out.println("\nSecond player turn");
			state--;
		}	
	}
	
	public void turn(Player player1, Player player2) {
		if (state == 1) {
			System.out.println("\nThe turn of " + player1.name);
			state++;
		}
		else {
			System.out.println("\nThe turn of " + player2.name);
			state--;
		}	
	}
	
	public void action(Player player1, Player player2, Scanner in) {
		int attacker = 0; int defender = 0;
		
		System.out.println("Choose your hero for attack");
		for(int i = 0; i < 3; i++) {
			if(player1.getUnit(i).getHealth()>0) {
				System.out.println((i+1)+". "+player1.getUnit(i).toString()); //print all alive heroes of player who is attacking
			}
		}
		
		boolean attacker_chosen = false;
		while(!attacker_chosen) {
			String attack_choice = in.next();
			switch(attack_choice) {
				case "1":
					if(player1.getUnit(0).getHealth()>0) {
						attacker = 0;
						attacker_chosen = true;
					}
					else {
						System.out.println("This hero is dead, choose another.");
					}
					break;
				case "2":
					if(player1.getUnit(1).getHealth()>0) {
						attacker = 1;
						attacker_chosen = true;
					}
					else {
						System.out.println("This hero is dead, choose another.");
					}
					break;
				case "3":
					if(player1.getUnit(2).getHealth()>0) {
						attacker = 2;
						attacker_chosen = true;
					}
					else {
						System.out.println("This hero is dead, choose another.");
					}
					break;
				default:
					System.out.println("Try again");
					break;
			}
		}
		
		System.out.println("Choose enemy hero to attack");
		for(int i = 0; i < 3; i++) {
			if(player2.getUnit(i).getHealth()>0) {
				System.out.println((i+1)+". "+player2.getUnit(i).toString()); //print all alive heroes of player who is defending
			}
		}
		
		boolean defender_chosen = false;
		while(!defender_chosen) {
			String defend_choice = in.next();
			switch(defend_choice) {
				case "1":
					if(player2.getUnit(0).getHealth()>0) {
						defender = 0;
						defender_chosen = true;
					}
					else {
						System.out.println("This hero is dead, choose another.");
					}
					break;
				case "2":
					if(player2.getUnit(1).getHealth()>0) {
						defender = 1;
						defender_chosen = true;
					}
					else {
						System.out.println("This hero is dead, choose another.");
					}
					break;
				case "3":
					if(player2.getUnit(2).getHealth()>0) {
						defender = 2;
						defender_chosen = true;
					}
					else {
						System.out.println("This hero is dead, choose another.");
					}
					break;
				default:
					System.out.println("Try again");
					break;
			}
		}
		
		int health_before_attack = player2.getUnit(defender).getHealth(); //needs to print difference in health before and after an attack.
		player1.getUnit(attacker).attack(player2.getUnit(defender));//attack
		
		System.out.println("The " + player1.getUnit(attacker).getType() + " of player " + player1.name +
				" dealed " + (health_before_attack-player2.getUnit(defender).getHealth()) + " damage to "+
				player2.getUnit(defender).getType() + " of player " + player2.name);
	}
}
