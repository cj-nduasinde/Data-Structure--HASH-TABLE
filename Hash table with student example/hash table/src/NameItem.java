import java.util.*;

public class NameItem
{

	public String name;
	public int score;

	NameItem()
	{
		System.out.println("Enter the Score and Name");
		this.score = Integer.parseInt(new Scanner(System.in).nextLine());
		this.name = new Scanner(System.in).nextLine();
	}
}


