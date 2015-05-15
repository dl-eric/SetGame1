/*
 * Made by Helen
 * Edited by Eric
 */

public class ZetDeck extends Deck
{
  //Constructs a ZetDeck
  public ZetDeck()
  { 
    super(81);
    
    for(int shape = 1; shape <= 3; shape++)
    {
      for(int fill = 1; fill <= 3; fill++)
      {
        for(int number = 1; number <= 3; number++)
        {
          for(int color = 1; color <= 3; color++)
          {
            ZetCard card = new ZetCard(number, shape, fill, color);
            add(card);
          }
        }
      }
    }
  }
}
