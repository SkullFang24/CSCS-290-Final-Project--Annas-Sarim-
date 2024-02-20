//Annas Ahmad 231-520655
//Sarim Rabbi 231-520099
import java.util.*;
public class PatayPePata {

	ArrayList<Card> Deck = new ArrayList<Card>();
	ArrayList<Card> Player1_Deck = new ArrayList<Card>();
	ArrayList<Card> Player2_Deck = new ArrayList<Card>();
	ArrayList<Card> Table_Deck = new ArrayList<Card>();
	int Current_Player = 1;
	public static void main(String[] args) 
	{
		PatayPePata game = new PatayPePata();
		game.createDeck();
		game.play();
	}
	public void createDeck() 
	{
		for (int i = 2; i <= 14; i++) 
		{
			Deck.add(new Card("Spades", i));
			Deck.add(new Card("Hearts", i));
			Deck.add(new Card("Clubs", i));
			Deck.add(new Card("Diamonds", i));
		}
		Collections.shuffle(Deck);
		Player1_Deck.addAll(Deck.subList(0, 26));
		Player2_Deck.addAll(Deck.subList(26, 52));
	}
	public void play() 
	{
		while (Player1_Deck.size() > 0 && Player2_Deck.size() > 0) 
		{
			if (Current_Player == 1) 
			{
				turn(Player1_Deck, Player2_Deck);
			} else {
				turn(Player2_Deck, Player1_Deck);
			}
		}

		if (Player1_Deck.size() == 0) 
		{
			System.out.println("\n\tPlayer 1 🖱️ wins!");
		} 
		else 
		{
			System.out.println("\n\tPlayer 2 🎮 wins!");
		}
	}
	public void turn(ArrayList<Card> Player1_Deck, ArrayList<Card> Player2_Deck) 
	{
		Card currentCard = Player1_Deck.get(0);
		Player1_Deck.remove(0);
		Table_Deck.add(0, currentCard);
		System.out.println("Player " + Current_Player + " Plays " + currentCard.toString());

		if (Table_Deck.size() > 1 && currentCard.getFaceValue() == Table_Deck.get(1).getFaceValue()) 
		{
			System.out.println("\nPlayer " + Current_Player + " Take The Table Deck\n");
			Player1_Deck.addAll(Table_Deck);
			Table_Deck.clear();
			Collections.shuffle(Deck);
			if (Current_Player == 1) 
			{
				Current_Player = 2;
			} 
			else 
			{
				Current_Player = 1;
			}
		}
		else 
		{
			if (Current_Player == 1) 
			{
				Current_Player = 2;
			} 
			else 
			{
				Current_Player = 1;
			}
		}
	}
}

