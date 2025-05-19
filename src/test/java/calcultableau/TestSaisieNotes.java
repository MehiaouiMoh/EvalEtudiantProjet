package calcultableau;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;
import java.io.ByteArrayInputStream;

public class TestSaisieNotes {

    @Test
    public void testSaisieAvecNbFixe() {
        // Simuler les entrées utilisateur :
        // "yes", "3", "10.5", "15.0", "18.25"
        String input = "yes\n3\n10.5\n9.40\n18.25\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        SaisieNotes saisie = new SaisieNotes();
        double[] result = saisie.SaisirTableau(scanner);
        
        saisie.afficherTableau(result);
        
        //Arrays.sort(result);

        //assertArrayEquals(new double[]{10.5, 9.40, 18.25}, result);
    }
    
    @Test
    public void testSaisieZeroNotes() {
        // Simuler les entrées utilisateur :
        // "yes", "3", "10.5", "15.0", "18.25"
        String input = "yes\n0\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        SaisieNotes saisie = new SaisieNotes();
        double[] result = saisie.SaisirTableau(scanner);
        
        //saisie.afficherTableau(result);
        
        //Arrays.sort(result);

        //assertArrayEquals(new double[]{10.5, 9.40, 18.25}, result);
    }
    
    @Test
    public void testSaisieLibre() {
        // Simuler les entrées utilisateur :
        // "no", "12.5", "17.75", "-1"
        String input = "no\n18.5\n17.75\n-1\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        SaisieNotes saisie = new SaisieNotes();
        double[] result = saisie.SaisirTableau(scanner);
        
        saisie.afficherTableau(result);

        //assertArrayEquals(new double[]{12.5, 17.75}, result);
    }
}
