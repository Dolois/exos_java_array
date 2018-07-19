import java.util.Scanner;

public class exo4 
{
	/*
	 * Ecrire un programme qui saisit deux indices au clavier et
	 * �changer les valeurs contenues dans le tableau � ces deux indices.
     * Le programme affichera le contenu du tableau avant et apr�s cette transformation.
	 */
	
	public static void changerAfficher(int ind1, int ind2)
	{
		// d�claration et initialisation d'un tableau
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
		// contenu du tableau avant transformation
		System.out.println("Avant");
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "]" + " = " + tab[i] + ", ");	
		}
		System.out.println();
		
		int indTemp = -1;
		// phase de transformation
		for (int i = 0; i < tab.length; i++)
		{
			if (i == ind1)
			{
				indTemp = tab[i];
			}
			if (i == ind2)
			{
				tab[ind1] = tab[i];
				tab[i] = indTemp;
			}
		}
		
		// contenu du tableau apr�s transformation
		System.out.println("Apr�s");
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "]" + " = " + tab[i] + ", ");
		}
	}

	public static void main(String[] args) 
	{
		// d�clarer un scanner et cr�er une instance de la classe Scanner
		Scanner sc = new Scanner(System.in);

		int ind1;
		System.out.println("Saisir le premier indice : ");
		ind1 = sc.nextInt();
		
		int ind2;
		System.out.println("Saisir le deuxi�me indice : ");
		ind2 = sc.nextInt();
		
		changerAfficher(ind1, ind2);
	}
}
