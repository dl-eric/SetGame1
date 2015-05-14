/**
 *  Represents a generic deck of cards.
 */

/*

  Tips:

  - Use an ArrayList<Card> to hold the cards.
  - Add and remove cards at the end of the list.
  - Use Collections.shuffle and Collections.sort to shuffle and sort the deck,
    or write your own methods.  If you write your own, use selection sort
    to sort and a similar algorithm to shuffle.  Use Math.random().
  - In the toString method, separate strings for individual cards with "\n".

*/

import java.util.*;

public class Deck
{
	public ArrayList<Card> cards;
	public Deck()
	{ 
	    cards = new ArrayList<Card>();
	}
	public Deck(int capacity) 
	{ 
		cards = new ArrayList<Card>(capacity); 
	}      // creates an empty deck
	                                                           //   of given capacity
	public int getNumCards()
	{
		return cards.size();
	}
	public boolean isEmpty()
	{
		return (cards.size() == 0);
	}
	public void add (Card card)
	{
		cards.add(card);// adds card to the top
	}
	public Card takeTop()
	{
	   return cards.remove(0);// removes card from the top
	}
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
	public void sort()
	{
		Collections.sort(cards);
	}
	public String toString()
	{
		return cards + "";
	}
	    
	    
	}

