import java.util.Scanner;

public class exo2 
{
	/*
	 * Ecrire un programme qui saisit un entier au clavier et
	 * qui recherche si cet entier appartient au tableau.
	 * Au cas ou la réponse est positive, l'indice de cet entier
	 * dans le tableau est affiché.
	 * S'il y a plusieurs occurrences, le dernier indice est affiché.
	 */

	public static void main(String[] args) 
	{
		// déclaration et initialisation d'un tableau
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14}; 

		int entier;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier :");
		entier = sc.nextInt();
		
		int j = -1;
		boolean trouve = false;
		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] == entier)
			{
				j = i;
				trouve = true;
			}
		}
		if (trouve)
		{
			System.out.println("L'indice trouvé est : " + j);
		}
	}

}
