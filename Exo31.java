import java.util.Scanner;

public class Exo31 {

	/* Ecrire un programme qui saisit 10 caract�res au clavier, puis ensuite,
	 * calcule le nombre de majuscules et le nombre de lettres dans ce tableau.
	 * Un caract�re n'est pas forc�ment une lettre : ce peut �tre un chiffre,
	 * un signe de ponctuation, un caract�re sp�cial.
	 * 
	 * Question n� 1 :
	 * Pour cette question, on ne concid�re que les lettres sans accent.
	 * Pour d�terminer si un caract�re est une lettre, on utilise l'ordre
	 * sur les caract�res. Est une lettre tout caract�re compris entre
	 * 'a' et 'z' et entre 'A' et 'Z'. Est une majuscule tout caract�re
	 * compris entre 'A' et 'Z'.
	 */
	
	public static void main(String[] args) {
		
		// d�clarer un scanner et cr�er une instance de la classs Scanner
		Scanner sc = new Scanner(System.in);
		
		char[] tab = new char[10];

		// saisir 10 caract�res et les stocker dans un tableau
		int j = 1;
		int lettres = 0;
		int majuscules = 0;
		for (int i = 0; i < tab.length; i++)
		{
			// saisir les dix caract�res
			System.out.println("Saisir caract�re n� " + j + " : ");
			// stocker les �l�ments dans le tableau
			tab[i] = sc.nextLine().charAt(0);
			j++;
			
			if ((tab[i] >= 'a' && tab[i] <= 'z') ||
			    (tab[i] >= 'A' && tab[i] <= 'Z'))
			{
				lettres++;
				
				if (tab[i] >= 'A' && tab[i] <= 'Z')
				{
					majuscules++;
				}
			}
		}
		sc.close();
		
		for (int i = 0; i < tab.length; i++)
		{
			System.out.print("tab[" + i + "] = " + tab[i] + " ");
		}
		System.out.println();
		System.out.println("Nombre de lettres    : " + lettres);
		System.out.println("Nombre de majuscules : " + majuscules);
	}

}
