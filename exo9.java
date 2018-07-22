import java.util.Scanner;

public class exo9 {

	/* Ecrire un programme qui saisit d'abord un nombre n, 
	 * puis ensuite saisit n caracteres
	 * et les placer dans un tableau.
	 */
	
	/* 
	 * byte b     = sc.nextByte();
	 * short  sht = sc.nextShor();
	 * int i      = sc.nextInt();
	 * long l     = sc.nextLong();
	 * string str = sc.nextLine();
	 * float f    = sc.nextFloat();
	 * double d   = sc.nextDouble();
	 */
	
	public static void afficherTableau(String[] tab)
	{
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "] = " + tab[i] + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		// d�clarer un tableau de String avec la taille
		String[] tab = new String[8];
		
		// d�clarer un scanner et cr�er une instance de classe Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre :");
		// stocker un nombre dans une variable de type double
		double d = sc.nextDouble();
		
		// conversion d'un double en string
		tab[0] = Double.toString(d);
		
		// d�clarer un scanner et cr�er une instance de classe Scanner
		Scanner sc1 = new Scanner(System.in);
		
		// saisir n caract�res et les stocker dans un tableau
		for (int i = 1; i < tab.length; i++)
		{
			// stocker le caract�re dans un tableau de type string
			System.out.println("Saisir un caract�re : ");
			tab[i] = sc1.nextLine();
		}
		
		sc.close();
		sc1.close();
		
		// appeler la m�thode afficherTableau
		afficherTableau(tab);
	}
}