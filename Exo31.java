import java.util.Scanner;

public class Exo31 {

	/* Ecrire un programme qui saisit 10 caractères au clavier, puis ensuite,
	 * calcule le nombre de majuscules et le nombre de lettres dans ce tableau.
	 * Un caractère n'est pas forcément une lettre : ce peut être un chiffre,
	 * un signe de ponctuation, un caractère spécial.
	 * 
	 * Question n° 1 :
	 * Pour cette question, on ne concidère que les lettres sans accent.
	 * Pour déterminer si un caractère est une lettre, on utilise l'ordre
	 * sur les caractères. Est une lettre tout caractère compris entre
	 * 'a' et 'z' et entre 'A' et 'Z'. Est une majuscule tout caractère
	 * compris entre 'A' et 'Z'.
	 */
	
	public static void main(String[] args) {
		
		// déclarer un scanner et créer une instance de la classs Scanner
		Scanner sc = new Scanner(System.in);
		
		char[] tab = new char[10];

		// saisir 10 caractères et les stocker dans un tableau
		int j = 1;
		int lettres = 0;
		int majuscules = 0;
		for (int i = 0; i < tab.length; i++)
		{
			// saisir les dix caractères
			System.out.println("Saisir caractère n° " + j + " : ");
			// stocker les éléments dans le tableau
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
