import java.util.Scanner;

public class exo6 
{
	/*
	 * Ecrire un programme qui saisit 6 entiers et les stocke dans un tableau,
	 * puis rechercher et afficher le plus grand élément du tableau 
	 */
	
	public static void rechercherAfficher(int[] tab)
	{
		// affichage des 6 éléments du tableau
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "]" + " = " + tab[i] + ", ");
		}
		System.out.println();
		
		// rechercher l'entier le plus grand du tableau
		int entierTemp = -999999999;
		for (int i = 0; i < tab.length; i++)
		{
			if (tab[i] > entierTemp)
			{
				entierTemp = tab[i];
			}
		}
		// afficher l'entier le grand du tablea
		System.out.println("L'entier le plus grand du tableau est : " + entierTemp);
	}
	
	public static void main(String[] args) 
	{
		// déclarer un tableau d'entiers avec une taille de 6 éléments
		int[] tab = new int[6];
		
		// déclarer un scanner et créer une instance de classe Scanner
		Scanner sc = new Scanner(System.in);
		
		// saisir 6 entiers et les stocker dans un tableau
		int j = 0;
		for (int i = 0; i < tab.length; i++)
		{
			j++;
			System.out.println("Saisir entier n° " + j + " : ");
			tab[i] = sc.nextInt();
		}
		rechercherAfficher(tab);
	}
}
