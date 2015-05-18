/*
 * Eric Lee
 * 5/12/15
 * Tests ZetAnalyzer
 */
public class TestZetAnalyzer
{
  public static void main(String[] args)
  {
    ZetDeck deck1 = new ZetDeck();
    
    for(int i = 1; i < 82; i++)
    {
      ZetCard card = (ZetCard)deck1.takeTop();
      System.out.println(i + " " + card.toString());
    }
    
    System.out.println("-------------------------------");
   
    ZetDeck deck2 = new ZetDeck();
    for(int a = 1; a < deck2.getNumCards(); a++)
    {
      ZetCard card1 = (ZetCard)deck2.takeTop();
      ZetCard card2 = (ZetCard)deck2.takeTop();
      ZetCard card3 = (ZetCard)deck2.takeTop();
      
      if(ZetAnalyzer.isZet(card1, card2, card3))
      {
        System.out.println(card1.toString() + " " + card2.toString() + " " + card3.toString());
      }
    }
    
    System.out.println("-------------------------------");
    
    ZetDeck deck3 = new ZetDeck();
    ZetCard[] cards = new ZetCard[3];
    cards[0] = (ZetCard)deck3.takeTop();
    cards[1] = (ZetCard)deck3.takeTop();
    cards[2] = (ZetCard)deck3.takeTop();
    
    System.out.println(ZetAnalyzer.findZet(cards)[0] + ", " + ZetAnalyzer.findZet(cards)[1] + ", " + ZetAnalyzer.findZet(cards)[2]);
    
  }
}
