import java.util.Scanner;

public class util {
    public void Introduction(Player player, Scanner in) {

        System.out.println("Hello traveler! It is the time to take part in the mysterious adventure!");
        System.out.println("But first, what is your name?");
        String name = in.next();
        System.out.println(name+"? "+"Sounds great!");
        player.setName(name);
        
        String choice = "";
        System.out.println("Now you need to set up a team!\n You need 3 heroes");
        for(int i = 0; i < 3; i++) 
        {
        	boolean character_chosen = false;
	        while(!character_chosen)
	        {
	            System.out.println("\nChoose your hero #" + (i+1) +"\n" +
	                    "to choose the knight enter K\n" +
	                    "to choose the wizard enter W\n" +
	                    "to choose the archer enter A");
	            choice = in.next();
	            switch (choice)
	            {
	                case "K":
	                    character_chosen = true;
	                    System.out.println("Excellent choice! Sharp sword and strong armor is on your side today");
	                    player.setUnit(i, new Knight());
	                    break;
	                case "W":
	                    character_chosen = true;
	                    System.out.println("Excellent choice! One spell, many problems for your enemies");
	                    player.setUnit(i, new Wizard());
	                    break;
	                case "A":
	                    character_chosen = true;
	                    System.out.println("Excellent choice! Marksman is at your service");
	                    player.setUnit(i, new Archer());
	                    break;
	                default:
	                    System.out.println("Well. I think " + choice + " is bad for your team...");
	                    break;
	            }
	        }
        }
    }
    public void EndOfGame(Player player) {
    	System.out.println("\n"+player.name + " wins! It was a brave battle!");
    }
}
