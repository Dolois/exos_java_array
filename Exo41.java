import java.util.Scanner;

public class Exo41 {
	
	/* Ecrire un programme qui saisit un nombre au clavier
	 * et qui calcule un tableau dont le plus grand indice
	 * est n et dans lequel il y a, pour chaque case d'indice i,
	 * la somme des entiers compris entre 0 et i.
	 */

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int[] tab;
		int n;			

		System.out.print("Entrez un nombre entier : ");
		n = sc.nextInt();
		
		System.out.println();

		tab = new int[n + 1];

		for(int i = 0; i <= n; i++)
		{
			if(i == 0)
			{
				tab[i] = 0;
			}
			else
			{
				// cumuler la valeur de l'élément précédent avec
				// la valeur du nombre courant du tableau
				tab[i] = tab[i - 1] + i;
			}
		}
		
		for(int i = 0; i <= n; i++)
		{
			System.out.print(tab[i] + " ");
		}
	}
}
