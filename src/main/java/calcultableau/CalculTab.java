package calcultableau;

import java.util.*;
	// Somme des éléments d'un tableau d'entiers

	public class CalculTab {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			SaisieNotes notes = new SaisieNotes();
			double[] tabNotes = notes.SaisirTableau(scanner);
			notes.afficherTableau(tabNotes);
			
			System.out.println("****FIN PROGRAMME****");
		}
}
