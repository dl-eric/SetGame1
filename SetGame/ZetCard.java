public class ZetCard extends Card
{
  int number, shape, fill, color;

  //Combines the four attributes to make a unique ID in the range from 0 to 80
  public ZetCard(int n, int s, int f, int c)
  {
    super((n - 1) * 27 + (s - 1) * 9 + (f - 1) * 3 + (c- 1));
    number = n;
    shape = s;
    fill = f;
    color = c;
  }
  
  //Returns the number of symbols on this card
  public int getNumber()
  {
    return number;
  }
  
  //Returns the card's shape code (1 for oval, 2 for squiggle, 3 for diamond)
  public int getShape()
  {
    return shape;
  }
  
  //Returns the card's fill code (1 for outlined, 2 for solid, 3 for striped)
  public int getFill()
  {
    return fill;
  }
  
  //Returns the card's color code (1 for red, 2 for green, 3 for blue)
  public int getColor()
  {
    return color;
  }
  
  //Returns a string representation of a card
  public String toString()
  {
    return "Card: Number = " + number + ", Shape = " + shape + ", Fill = " + fill + ", Color = " + color;
  }
}

