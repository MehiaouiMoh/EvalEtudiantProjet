package calcultableau;

public class Calculator {

    public double Somme(double[] notes) {
        if (notes == null || notes.length == 0) {
            System.out.println("Erreur : tableau vide. Somme = 0.");
            return 0;
        }

        double somme = 0;
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
        }

        return somme;
    }

    public double moyenneGroupeTP(double somme, int nbDeNotes) {
        if (nbDeNotes == 0) {
            System.out.println("Erreur : division par zéro. Moyenne = 0.");
            return 0;
        }

        return Math.round((somme / nbDeNotes)*100.0)/100.0;
    }

    public double medianeNotes(double[] notes) {
        if (notes == null || notes.length == 0) {
            System.out.println("Erreur : tableau vide. Médiane = 0.");
            return 0;
        }

        double mediane;

        if (notes.length % 2 == 0) {
            int indiceTabPair = (notes.length / 2) - 1;
            mediane = Math.round(((notes[indiceTabPair] + notes[indiceTabPair + 1]) / 2) * 100.0) / 100.0;
        } else {
            int indiceTabImpair = (notes.length - 1) / 2;
            mediane = notes[indiceTabImpair];
        }

        return mediane;
    }
}
