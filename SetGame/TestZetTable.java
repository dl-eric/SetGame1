
public class TestZetTable 
{

	public static void main(String[] args) 
	{
		while (!deck.isEmpty)
		{
			ZetTable table = new ZetTable();
			table.findZet();
			while (table.findZet() == null)
			{
				boolean gameover = table.open3Cards();
				if (!gameover)
				{
					System.out.print("Game Over");
				}
			}
			
			System.out.print(table.toString());
			
			int[] indices = new int[]{1, 2, 3};
			table.remove3Cards(indices);
			
			if(!table.enoughOpen())
			{
				boolean gameover = table.open3Cards();
				if(!gameover)
				{
					System.out.print("Game Over");
				}
			}
		}
	}
}
