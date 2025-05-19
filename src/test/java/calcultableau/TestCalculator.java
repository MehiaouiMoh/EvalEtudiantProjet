package calcultableau;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.io.ByteArrayInputStream;

public class TestCalculator {

	@Test
	public void TestCalculatorSomme() {
		
		String input = "yes\n8\n18.5\n10.45\n20.0\n14.30\n15.2\n10.80\n12\n13.40\n";
	    Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

	    SaisieNotes saisie = new SaisieNotes();
	    double[] notes = saisie.SaisirTableau(scanner);
	    
	    System.out.println();
	    
	    saisie.afficherTableau(notes);
	    
		
		Calculator calculatrice = new Calculator();
		
		System.out.println();
		
		double somme = calculatrice.Somme(notes);
		System.out.println("Somme des notes : " + somme);
	}
	
	@Test
	public void TestCalculatorMoyenne() {
		
		String input = "yes\n8\n18.5\n10.45\n20.0\n14.30\n15.2\n10.80\n12\n13.40\n";
	    Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

	    SaisieNotes saisie = new SaisieNotes();
	    double[] notes = saisie.SaisirTableau(scanner);
	    
	    System.out.println();
	    
	    //saisie.afficherTableau(notes);
	    
		
		Calculator calculatrice = new Calculator();
		
		System.out.println();
		
		double somme = calculatrice.Somme(notes);
		double moyenne = calculatrice.moyenneGroupeTP(somme, notes.length);
		System.out.println("Moyenne des notes du groupe : " + moyenne);
	}
	
	@Test
	public void TestCalculatorMoyenneByZero() {
		
		String input = "yes\n8\n18.5\n10.45\n20.0\n14.30\n15.2\n10.80\n12\n13.40\n";
	    Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

	    SaisieNotes saisie = new SaisieNotes();
	    double[] notes = saisie.SaisirTableau(scanner);
	    
	    System.out.println();
	    
	    //saisie.afficherTableau(notes);
	    
		
		Calculator calculatrice = new Calculator();
		
		System.out.println();
		
		double somme = calculatrice.Somme(notes);
		double moyenne = calculatrice.moyenneGroupeTP(somme, 0);
		System.out.println("Moyenne des notes du groupe : " + moyenne);
	}
	
	@Test
	public void TestCalculatorMediane() {
		
		String input = "yes\n0\n";
	    Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

	    SaisieNotes saisie = new SaisieNotes();
	    double[] notes = saisie.SaisirTableau(scanner);
	    
	    System.out.println();
	    
	    //saisie.afficherTableau(notes);
	    
		
		Calculator calculatrice = new Calculator();
		
		System.out.println();
		
		double mediane = calculatrice.medianeNotes(notes);
		System.out.println("Médiane de la série de notes : " + mediane);
	}

}
