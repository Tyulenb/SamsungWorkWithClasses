import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		while(true) {
			System.out.println("\nChoose gamemode\n"
					+ "1. 2 players\n"
					+ "2. Batlle with the computer\n"
					+ "3. Auto-game\n"
					+ "4. Exit");
			Scanner in = new Scanner(System.in);
			String choice = in.next();
			
			switch(choice) {
				case "1":
					Player player1 = new Player();
					Player player2 = new Player();				
					Scenary scene = new Scenary();
					util util1 = new util();
					int defeated1 = 0; int defeated2 = 0;
					
					System.out.println("The game is started!");
					scene.turn();
					util1.Introduction(player1, in);
					scene.turn();
					util1.Introduction(player2, in);
					
					while(defeated1 < 3 && defeated2 < 3) {
						defeated1 = 0; defeated2 = 0;
						if(scene.state == 1) {
							scene.turn(player1, player2);
							scene.action(player1, player2, in);
						}
						else {
							scene.turn(player1, player2);
							scene.action(player2, player1, in);
						}
						
						for(int i = 0; i < 3; i++) {
							if(player1.getUnit(i).getHealth() < 0) {
								defeated1++;
							}
							if(player2.getUnit(i).getHealth() < 0) {
								defeated2++;
							}
						}
					}
					if(defeated1 == 3) {
						util1.EndOfGame(player2);
					}
					else {
						util1.EndOfGame(player1);
					}
				break;	
					
				case "2":
					System.out.println("Coming soon!");
					break;
				case "3":
					System.out.println("Coming soon!");
					break;
				case "4":
					System.out.println("Farewell!!");
					System.exit(0);
				default:
					System.out.println("Try again");
					break;
			}
		}
	}
}
