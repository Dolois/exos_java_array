import java.util.Scanner;

public class exo7 
{
	/*
	 * Ecrire un programme qui saisit 6 caractères et les stocke dans un tableau,
	 * puis rechercher et afficher le plus grand élément du tableau 
	 */
	public static void main(String[] args) 
	{
		// déclaration d'un tableau de chaine de caractère avec une taille de 6 éléments
		String[] tab = new String[6];
		
		// déclaration d'un objet Scanner
		Scanner sc = new Scanner(System.in);
		
		// saisie des 6 éléments dans le tableau
		int j = 0;
		for (int i = 0; i < tab.length; i++)
		{
			j++;
			System.out.println("Saisir caractère n° " + j + " : ");
			tab[i] = sc.nextLine();
		}
		
		// affichage des 6 éléments du tableau
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "]" + " = " + tab[i] + ", ");
		}
		System.out.println();
		
		
		String caractTemp = "a";
		for (int i = 0; i < tab.length; i++)
		{
			if (caractTemp.compareTo(tab[i]))
			{
				caractTemp = tab[i];
			}
		}
		System.out.println("L'entier saisi le plus grand est : " + caractTemp);
	}
}
