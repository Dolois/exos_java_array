import java.util.Scanner;

public class deuxiemeTableau {

	public static void main(String[] args) {
		
		/* ecrire un programme qui saisit un entier au clavier et 
		 * qui recherche si cet entier appartient au tableau
		 * 
		 * r�gles : r�ponse par oui / non
		 * 
		 * Note : il serait possible d�arr�ter la recherche d�s 
		 * qu�on a trouv� le nombre avec une instruction
		 * break pour sortir de la boucle for.
		 */
		
		// d�claration et initialisation d'un tableau
		int [] tab = {12, 15, 13, 10, 8, 9, 13, 14}; 

		// afficher la valeur du huiti�me �l�ment du tableau 
		System.out.println(tab[7]);
		
		// afficher tous les �l�ments du tableau sans boucle
		System.out.print(tab[0]);
		System.out.print(tab[1]);
		System.out.print(tab[2]);
		System.out.print(tab[3]);
		System.out.print(tab[4]);
		System.out.print(tab[5]);
		System.out.print(tab[6]);
		System.out.println(tab[7]);
		
		// boucle for de tous les �l�ments du tableau
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println();
		
		// modifier la valeur du cinqui�me �l�ment en mettant 5
		tab[4] = 5;
		
		int entier;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier :");
		entier = sc.nextInt();
		
		// modifier la valeur du cinqui�me �l�ment du tableau
		tab[4] = entier;
		System.out.println("La valeur de tab[4] est : " + tab[4]);

		
		// d�claration et initialisation de la r�ponse
		boolean reponse = false;
		
		for (int i = 0; reponse; i++) {
			
		}
	}

}
