import java.util.Scanner;

public class Exo44 {
	
	/* Ecrire un programme qui permet d'insérer des caractères saisies
	 * par l'utilisateur dans un tableau ayant déjà les caractères suivants :
	 * 
	 *  0    1    2    3	<-- indice
	 * 'x', 'r', 'l', 'b'	<-- valeur
	 * 
	 * Question n° 1
	 * L'utilisateur saisit le nombre de caractères qu'il veut ajouter dans le
	 * tableau, l'indice à partir duquel il veut les insérer et les caractères
	 * eux-mêmes. Notez que la taille des tableaux étant fixe en Java, on ne 
	 * peut pas réellement insérer des éléments en plus. Dans ce cas il faudra
	 * créer un nouveau tableau en recopiant les valeurs de l'ancien tableau et
	 * les nouvelles valeurs insérées conformément à la demande.
	 */

	public static void main(String[] args) 
	{
		char[] tabCourant = {'x', 'r', 'l', 'b'};
		char[] tabNouveau;
		char[] tabTempo;

		Scanner sc = new Scanner(System.in);
		
		int l = 0;

		int num;
		System.out.print("saisir un nombre de caracteres : ");
		num = sc.nextInt();
		System.out.println();
		
		tabTempo = new char[num];

		int ind;
		System.out.print("saisir un indice : ");
		ind = sc.nextInt();
		System.out.println();

		for (int j = 0; j < num; j++)
		{
			System.out.print("saisir un caractere : ");
			tabTempo[j] = sc.next().charAt(0);
		}
		System.out.println();
		
		tabNouveau = new char[tabCourant.length + num];

		for (int j = 0; j < tabNouveau.length; j++)
		{
			if (j == ind && ind < 4)
			{
				for (int k = 0; k < num; k++)
				{
					tabNouveau[j] = tabTempo[k];
					j++;
				}
			}
			else if (ind > 4 && j == 4)
			{
				for (int k = 0; k < num; k++)
				{
					tabNouveau[j] = tabTempo[k];
					j++;
				}
			}
			
			if (l < 4)
			{
				tabNouveau[j] = tabCourant[l];
				l++;
			}
		}

		for (int j = 0; j < tabNouveau.length; j++)
		{
			System.out.print(tabNouveau[j] + " ");
		}
	}
}