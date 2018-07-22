import java.util.Scanner;

public class exo9 {

	/* Ecrire un programme qui saisit d'abord un nombre n, 
	 * puis ensuite saisit n caracteres
	 * et les placer dans un tableau.
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
		// déclarer un tableau de String avec la taille
		String[] tab = new String[6];
		
		// déclarer un scanner et créer une instance de classe Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre :");
		// stocker un nombre dans une variable de type double
		
		// int i = sc.nextInt();
		// byte b  = sc.nextByte();
		// string str = sc.nextLine();
		// short  sht = sc.nextShor();
		// float f = sc.nextFloat();
		// double d= sc.nextDouble();
		// long l  = sc.nextLong();
		
		double d = sc.nextDouble();
		
		// conversion d'un entier en string
		tab[0] = Double.toString(d);
		
		// déclarer un scanner et créer une instance de classe Scanner
		Scanner sc1 = new Scanner(System.in);
		
		// saisir n caractères et les stocker dans un tableau
		for (int i = 1; i < tab.length; i++)
		{
			// stocker le caractère dans un tableau de type string
			System.out.println("Saisir un caractère : ");
			tab[i] = sc1.nextLine();
		}
		
		sc.close();
		sc1.close();
		
		// appeler la méthode afficherTableau
		afficherTableau(tab);
	}
}