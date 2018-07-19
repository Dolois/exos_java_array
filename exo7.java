import java.util.Scanner;

public class exo7 
{
	/*
	 * Ecrire un programme qui saisit 6 caract�res et les stocke dans un tableau,
	 * puis rechercher et afficher le plus grand �l�ment du tableau 
	 */
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
		
		// affichage des 6 �l�ments du tableau
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
