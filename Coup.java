import java.util.*;
public class Coup{

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		String card = "";
		while (!card.equals("quit")) {
	
		System.out.println("What card do you want to use?");
		card = input.nextLine();
		System.out.println(processCommand(card));
		}
	}
	
	public static String processCommand(String card) {
		if (card.equalsIgnoreCase("capitalist")) {
			return "Take 4 coins from the treasury. Give 1 coin to each player claiming capitalist.";
		}
		if (card.equalsIgnoreCase("priest")) {
			return "Take 1 coin from each player. Can be blocked by priest.";
		}
		if (card.equalsIgnoreCase("producer")) {
			return "Take 1 card from the deck and 1 from any target (target’s choice). Return any 1 card to the deck and target.";
		}
		if (card.equalsIgnoreCase("general")) {
			return "Pay 5 coins to make all other targets lose 1 influence.";
		}
		if (card.equalsIgnoreCase("judge")) {
			return "Give 3 coins to a target, forcing them to lose a life. If successfully countered or challenged, target keeps the 3 coins.";
		}
		if (card.equalsIgnoreCase("lawyer")) {
			return "Claim all the coins of a player who is eliminated from the game.";
		}
		if (card.equalsIgnoreCase("duke")) {
			return "Take 3 coins from the Treasury.";
		}
		if (card.equalsIgnoreCase("quit")) {
			return "";
		}
		
		
		
		return "That card isn't in this deck";
	}
}