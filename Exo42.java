import java.util.Scanner;

public class Exo42 
{
	
	/* Ecrire un programme qui saisit au clavier 4 valeurs 
	 * booléennes (true ou false en Java) et qui affiche 
	 * ensuite le résultat de l"opération && sur toutes 
	 * ces valeurs ainsi que le résultat de l'opération ||
	 * sur toutes ces valeur.
	 */
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		boolean[] tab = new boolean[4];

		for(int i = 0; i < 4; i++)
		{
			System.out.print("Entrez true ou false : ");
			tab[i] = sc.nextBoolean();
			System.out.println();
		}

		System.out.print(tab[0] + " && " + tab[1] + " && " + tab[2] + " && " + tab[3] + " = " 
					+ (tab[0] && tab[1] && tab[2] && tab[3]));
		
		System.out.println();
		
		System.out.print(tab[0] + " || " + tab[1] + " || " + tab[2] + " || " + tab[3] + " = " 
					+ (tab[0] || tab[1] || tab[2] || tab[3]));
	}
}