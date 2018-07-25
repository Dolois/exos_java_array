import java.util.Scanner;

public class Exo44 {
	
	/* Ecrire un programme qui permet d'ins�rer des caract�res saisies
	 * par l'utilisateur dans un tableau ayant d�j� les caract�res suivants :
	 * 
	 *  0    1    2    3	<-- indice
	 * 'x', 'r', 'l', 'b'	<-- valeur
	 * 
	 * Question n� 1
	 * L'utilisateur saisit le nombre de caract�res qu'il veut ajouter dans le
	 * tableau, l'indice � partir duquel il veut les ins�rer et les caract�res
	 * eux-m�mes. Notez que la taille des tableaux �tant fixe en Java, on ne 
	 * peut pas r�ellement ins�rer des �l�ments en plus. Dans ce cas il faudra
	 * cr�er un nouveau tableau en recopiant les valeurs de l'ancien tableau et
	 * les nouvelles valeurs ins�r�es conform�ment � la demande.
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