import java.util.Scanner;

public class exo8 
{
	/*
	 * Ecrire un programme qui saisit un tableau de 6 entiers puis calcule la moyenne de
	 * ces six entiers. Attention, la moyenne des entiers n'est pas un entier.
	 */
	
	public static void calcMoyenne(int[] tab)
	{	
		// afficher tous les �l�ments du tableau
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "]" + " = " + tab[i] + ", ");
		}
		System.out.println();
		
		double somme = 0;
		for (int i = 0; i < tab.length; i++)
		{
			// calculer la somme de tous les �l�ments du tableau
			somme = somme + tab[i];
		}
		// calculer la moyenne de tous les �l�ments du tableau
		double moyenne = 0;
		moyenne = (somme / tab.length);
		
		// afficher la moyenne calcul�e
		System.out.println(somme + " / " + tab.length + " = " + moyenne);
	}
	
	public static void main(String[] args) 
	{
		// d�clarer un tableau d'entiers avec une taille de 6 �l�ments
		int[] tab = new int[6];
		
		// d�clarer un scanner et cr�er une instance de classe Scanner
		Scanner sc = new Scanner(System.in);
		
		// saisir 6 entiers et les stocker dans un tableau
		int j = 0;
		for (int i = 0; i < tab.length; i++)
		{
			// saisir les 6 entiers
			j++;
			System.out.println("Saisir entier n� " + j + " : ");
			// stocker les �l�ments dans le tableau
			tab[i] = sc.nextInt();
		}
		
		// appeler la m�thode calcMoyenne
		calcMoyenne(tab);		
	}
}