import java.util.Scanner;

public class exo5 
{
	/*
	 * Ecrire un programme qui saisit 6 entiers
	 * les stocker dans un tableau,
	 * puis afficher le contenu de ce tableau une fois qu'il est rempli 
	 */
	
	
	public static void stockerAfficher(int a)
	{
		// d�claration d'un tableau d'entier avec une taille de 6 �l�ments
		int[] tab = new int[a];
		
		// d�claration d'un Scanner et cr�ation d'une instance Scanner
		Scanner sc = new Scanner(System.in);
		
		int j = 0;
		for (int i = 0; i < tab.length; i++)
		{
			j++;
			System.out.println("Saisir entier n� " + j + " : ");
			tab[i] = sc.nextInt();
		}
		
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "]" + " = " + tab[i] + ", ");
		}
	}
	
	public static void main(String[] args) 
	{
		int a = 6;
		stockerAfficher(a);
	}
}