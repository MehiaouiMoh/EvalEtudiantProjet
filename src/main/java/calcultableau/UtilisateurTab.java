package calcultableau;

import java.util.regex.Pattern;

public class UtilisateurTab {
    private String prenom;
    private String nom;
    private String email;
    private String dateExamen;
    private int nbEtudiants;
    private double moyenne;
    private double mediane;

    public UtilisateurTab(String prenom, String nom, String email, String dateExamen,
                          int nbEtudiants, double moyenne, double mediane) {
        this.prenom = prenom;
        this.nom = nom;
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Adresse e-mail invalide !");
        }
        this.dateExamen = dateExamen;
        this.nbEtudiants = nbEtudiants;
        this.moyenne = moyenne;
        this.mediane = mediane;
    }

    // Méthode de validation d'email via regex
    private boolean isEmailValid(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }

    public String toCSV() {
        return String.format(
            "%s,%s,%s,%s,%d,%.2f,%.2f",
            prenom, nom, email, dateExamen, nbEtudiants, moyenne, mediane
        );
    }

    public void afficherInfos() {
        System.out.println("------ Résultat Utilisateur ------");
        System.out.println("Nom complet : " + prenom + " " + nom);
        System.out.println("Email : " + email);
        System.out.println("Date de l'examen : " + dateExamen);
        System.out.println("Nombre d'étudiants : " + nbEtudiants);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Médiane : " + mediane);
        System.out.println("----------------------------------");
    }
}
