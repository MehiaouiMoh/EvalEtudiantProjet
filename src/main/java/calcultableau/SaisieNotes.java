package calcultableau;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SaisieNotes {
	
	public double[] SaisirTableau(Scanner sc) {
	    int nbNotes = 0;

	    System.out.println("Savez-vous combien de notes vous devez saisir ? yes/no");
	    String reponseNbNotes = sc.nextLine().trim();

	    if (reponseNbNotes.equalsIgnoreCase("yes")) {
	        System.out.println("Combien de notes devez-vous saisir ?");
	        nbNotes = Integer.parseInt(sc.nextLine());

	        if (nbNotes == 0) {
	            System.out.println("Vous n'avez saisi aucune note !!");
	            return new double[0]; // retourner un tableau vide pour éviter les erreurs
	        } else {
	            double[] tab = new double[nbNotes];
	            for (int i = 0; i < nbNotes; i++) {
	                double note = -1;
	                while (note < 0 || note > 20) {
	                    System.out.print("Veuillez entrer la note " + (i + 1) + " (0 à 20, 2 décimales max) : ");
	                    String input = sc.nextLine();
	                    try {
	                        note = Double.parseDouble(input);
	                        note = Math.round(note * 100.0) / 100.0; // arrondi à 2 décimales
	                        if (note < 0 || note > 20) {
	                            System.out.println("Note hors limites.");
	                        }
	                    } catch (NumberFormatException e) {
	                        System.out.println("Entrée invalide, veuillez saisir un nombre.");
	                    }
	                }
	                tab[i] = note;
	            }
	            Arrays.sort(tab);
	            return tab;
	        }

	    } else {
	        System.out.println("Vous devez saisir les notes une par une. Entrez -1 pour arrêter.");
	        ArrayList<Double> notesList = new ArrayList<>();
	        while (true) {
	            System.out.print("Entrez une note : ");
	            String input = sc.nextLine();
	            try {
	                double note = Double.parseDouble(input);
	                if (note == -1) break;
	                if (note < 0 || note > 20) {
	                    System.out.println("Note invalide, elle doit être comprise entre 0 et 20.");
	                    continue;
	                }
	                note = Math.round(note * 100.0) / 100.0;
	                notesList.add(note);
	            } catch (NumberFormatException e) {
	                System.out.println("Veuillez entrer une valeur numérique.");
	            }
	        }

	        Collections.sort(notesList);

	        double[] notes = new double[notesList.size()];
	        for (int i = 0; i < notesList.size(); i++) {
	            notes[i] = notesList.get(i);
	        }
	        return notes;
	    }
	}

	
	//Fonction affichage d'u tableau
	void afficherTableau(double[] tabNotes) {
		System.out.println("Voici les notes que vous avez saisis :");
		for(int i = 0; i< tabNotes.length; i++) {
			System.out.println(tabNotes[i]);
		}
	}
}
