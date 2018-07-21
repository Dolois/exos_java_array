import java.util.Scanner;

public class exo7 
{
	/*
	 * Ecrire un programme qui saisit 6 caractères et les stocke dans un tableau,
	 * puis rechercher et afficher le plus grand élément du tableau 
	 */
	
	public static void comparerAfficher(String[] tab)
	{
		// déclarer et affecter les variables
		String str1 = tab[0].toUpperCase();
		String str2;
		
		// boucle de tous les éléments du tableau
		for (int i = 0; i < tab.length; i++)
		{
			str2 = tab[i].toUpperCase();
			
			int comp = (str1.compareTo(str2));

			// si egaux = 0, si a > b = valeur positive, si a < b = valeur négative 
			if (comp == 0)
			{
				str1 = str2;
			}
			else if (comp > 0)
			{
				continue;
			}
			else
			{
				str1 = str2;
			}
		} System.out.println("L'élément le plus grand du tableau est : " + str1);
	}
	
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
		sc.close();
		
		// affichage des 6 éléments du tableau
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "]" + " = " + tab[i] + ", ");
		}
		System.out.println();

		comparerAfficher(tab);
	}
}
