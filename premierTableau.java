import java.util.Scanner;
import java.util.*;

public class premierTableau {

	public static void main(String[] args) {
		
		// déclaration d'un tableau d'entier
		int [] tabInt = new int [12];
		
		// initialisation du tableau d'entier
		int j = 10;
		for (int pos = 0; pos < 12; pos++ ) {
			tabInt[pos] = j;
			j--;
		}

		// lire le tableau rempli
		for (int pos = 0; pos < 12; pos++) {
				System.out.print(tabInt[pos] + " ");
		}
		System.out.println();
		
		/* déclaration d'un tableau de caractères
		 * char [];						<=> la variable est de type tableau de caractères
		 * tabAChar = new char [5];
		 *
		 * ou sur une ligne
		 *
		 */
		char [] tabAChar = new char [5];
		
		tabAChar[0] = 'a';
		tabAChar[1] = 'v';
		tabAChar[2] = 'i';
		tabAChar[3] = 'o';
		tabAChar[4] = 'n';
		
		// déclaration et initialisation d'un tableau de caractères
		char [] tabBChar = {'a', 'v', 'i', 'o', 'n'};
		
		// rechercher la lettre i dans le tableau
		// indice est = pos pour position
		for (int pos = 0; pos < 5; pos++) {
			if (tabBChar[pos] == 'i') {
				System.out.println("la lettre est : " + tabBChar[pos]);
			}
		}

		/* saisie d'une lettre par l'utilisateur
		 * si la lettre a ou n est trouvée
		 * alors il a gagné
		 * sinon il a perdu
		 */
		char letter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un caractère :");
		letter = sc.next().charAt(0);
		System.out.println("Vous avez saisi : " + letter);
		
		boolean trouve = false;
		for (int pos = 0; pos < 5; pos++) {
			if (((tabBChar[pos] == 'a') && (letter == 'a') ) 
			   || ((tabBChar[pos] == 'n') && (letter == 'n'))) {
				System.out.println("Tu as gagné " + tabBChar[pos]);
				trouve = true;
			} else if (trouve == false) {
				System.out.println("Tu as perdu " + tabBChar[pos]);
			}
		}
	}
}
