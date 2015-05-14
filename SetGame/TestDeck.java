
public class TestDeck {
public static void main(String[] args)
{
	Deck d = new Deck();
	Card c1 = new Card(1);
	Card c2 = new Card(2);
	Card c3 = new Card(3);
	d.add(c1);
	d.add(c2);
	d.add(c3);
	System.out.println(d);
	d.shuffle();
	System.out.println(d);
	d.sort();
	System.out.println(d);
	d.takeTop();
	System.out.println(d);
	d.takeTop();
	System.out.println(d);
}
}
