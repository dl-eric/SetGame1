/*
 * Eric Lee
 * 5/12/15
 */

public class ZetAnalyzer
{
  public static boolean isZet(ZetCard card1, ZetCard card2, ZetCard card3)
  {
     if(((card1.getShape() + card2.getShape() + card3.getShape()) % 3 == 0) &&
         ((card1.getFill() + card2.getFill() + card3.getFill()) % 3 == 0) &&
         ((card1.getColor() + card2.getColor() + card3.getColor()) % 3 == 0) &&
         ((card1.getNumber() + card2.getNumber() + card3.getNumber()) % 3 == 0))
       return true;
     else
       return false;
         
  }

  public static int[] findZet(ZetCard[] cards)
  {
    int[] zet = new int[3];
    for(int a = 0; a < cards.length; a++)
    {
      for(int b = a + 1; b < cards.length; b++)
      {
        for(int c = b + 1; b < cards.length; c++)
        {
          if (isZet(cards[a], cards[b], cards[c]))
          {
            zet[0] = a;
            zet[1] = b;
            zet[2] = c;
          }
        }
      }
    }
    return zet;
  }
}
