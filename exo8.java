import java.util.Scanner;

public class exo8 
{
	/*
	 * Ecrire un programme qui saisit un tableau de 6 entiers puis calcule la moyenne de
	 * ces six entiers. Attention, la moyenne des entiers n'est pas un entier.
	 */
	
	public static void calcMoyenne(int[] tab)
	{	
		// affichage des 6 éléments du tableau
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "]" + " = " + tab[i] + ", ");
		}
		System.out.println();
		
		double somme = 0;
		for (int i = 0; i < tab.length; i++)
		{
			somme = somme + tab[i];
		}
		double moyenne = 0;
		moyenne = (somme / tab.length);
		System.out.println(somme + " / " + tab.length + " = " + moyenne);
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
		calcMoyenne(tab);		
	}
}