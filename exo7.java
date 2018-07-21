import java.util.Scanner;

public class exo7 
{
	/*
	 * Ecrire un programme qui saisit 6 caract�res et les stocke dans un tableau,
	 * puis rechercher et afficher le plus grand �l�ment du tableau 
	 */
	
	public static void comparerAfficher(String[] tab)
	{
		// d�clarer et affecter les variables
		String str1 = tab[0].toUpperCase();
		String str2;
		
		// boucle de tous les �l�ments du tableau
		for (int i = 0; i < tab.length; i++)
		{
			str2 = tab[i].toUpperCase();
			
			int comp = (str1.compareTo(str2));

			// si egaux = 0, si a > b = valeur positive, si a < b = valeur n�gative 
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
		} System.out.println("L'�l�ment le plus grand du tableau est : " + str1);
	}
	
	public static void main(String[] args) 
	{
		// d�claration d'un tableau de chaine de caract�re avec une taille de 6 �l�ments
		String[] tab = new String[6];

		// d�claration d'un objet Scanner
		Scanner sc = new Scanner(System.in);

		// saisie des 6 �l�ments dans le tableau
		int j = 0;
		for (int i = 0; i < tab.length; i++)
		{
			j++;
			System.out.println("Saisir caract�re n� " + j + " : ");
			tab[i] = sc.nextLine();
		}
		sc.close();
		
		// affichage des 6 �l�ments du tableau
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "]" + " = " + tab[i] + ", ");
		}
		System.out.println();

		comparerAfficher(tab);
	}
}
