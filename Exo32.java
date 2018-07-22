import java.util.Scanner;

public class Exo32 {

	/* Ecrire un programme qui saisit 10 caractères au clavier, puis ensuite,
	 * calcule le nombre de majuscules et le nombre de lettres dans ce tableau.
	 * Un caractère n'est pas forcément une lettre : ce peut être un chiffre,
	 * un signe de ponctuation, un caractère spécial.
	 * 
	 * Question 2
	 * les deux méthodes suivantes sont imposées :
	 * Character.isLetter    qui prend en paramêtre un caractère et renvoie un boolean.
	 * Character.isUppercase qui prend en paramêtre un caractère et renvoie un boolean.
	 */
	
	public static void main(String[] args)
	{

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
