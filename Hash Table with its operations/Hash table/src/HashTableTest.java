

import java.util.*;

public final class HashTableTest
{
	public static void main(String args[])
	{
		int Key;
		
		/* Create an empty hash table */
		HashTableClass HT = new HashTableClass();
		HT.PrintHashTable();
		
		/* Append 8 items to the hash table */
		System.out.println("Insert 8 items into an empty hash table:");
		for (int i = 0; i <= 7; i++)
		{
			NameItem x = new NameItem();
			HT.Insert(x);
		}
		System.out.println("Display all items in the Hash Table:");
		HT.PrintHashTable();

		/* Test the operations for the hash table */
		System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3)
		{
			if (s == 1)
			{
				System.out.println("Enter an key of the node that you want to search:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				Node n = HT.Search(Key);
				if (n != null)
					System.out.println(n.item.key + "," + n.item.name);
				else
					System.out.println("there is no such item!");
			};
			if (s == 2)
			{
				NameItem x = new NameItem();
				HT.Insert(x);
				System.out.println("Display all items in the hash table:");
				HT.PrintHashTable();
			};
			if (s == 3)
			{
				System.out.println("Enter the key of the item that you want to delete:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
				HT.Delete(Key);
				System.out.println("Dispaly all items in the hash table:");
				HT.PrintHashTable();
			};

			System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}

	}

}
