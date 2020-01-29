public class Card {
	public enum Rank {TWO, THREE, FOUR, FIVE, SIX, SEVEN,
			EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}

	public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}

	private final Rank rank;
	private final Suit suit;

	public Card(Rank rank, Suit suit)
	{
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank(){return rank;}
	public Suit getSuit(){return suit;}

	public static void main(String[] args)
	{
		Card card = new Card(Card.Rank.THREE, Card.Suit.DIAMONDS);
	}
}