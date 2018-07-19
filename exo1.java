import java.util.Scanner;

public class exo1 
{
	public static void main(String[] args)
	{
		// déclaration et initialisation d'un tableau
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14}; 

		int entier;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier :");
		entier = sc.nextInt();
		
		boolean trouve = false;
		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] == entier)
			{
				trouve = true;
				i = tab.length;
			}
		}
		if (trouve)
		{
			System.out.println("oui");
		}
		else
		{
			System.out.println("non");
		}
	}
}
