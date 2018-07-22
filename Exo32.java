import java.util.Scanner;

public class Exo32 {

	/* Ecrire un programme qui saisit 10 caract�res au clavier, puis ensuite,
	 * calcule le nombre de majuscules et le nombre de lettres dans ce tableau.
	 * Un caract�re n'est pas forc�ment une lettre : ce peut �tre un chiffre,
	 * un signe de ponctuation, un caract�re sp�cial.
	 * 
	 * Question 2
	 * les deux m�thodes suivantes sont impos�es :
	 * Character.isLetter    qui prend en param�tre un caract�re et renvoie un boolean.
	 * Character.isUppercase qui prend en param�tre un caract�re et renvoie un boolean.
	 */
	
	public static void main(String[] args)
	{

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
			
			if ((Character.isLetter(tab[i])))
			{
				lettres++;
					
				if ((Character.isUpperCase(tab[i])))
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
