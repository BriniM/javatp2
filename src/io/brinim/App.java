package io.brinim;

import java.util.Scanner;

public class App {
    static Gestionnaire medicaments = new Gestionnaire();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean keepLooping = true;
        while (keepLooping) {
            System.out.print("Operations (ajouter | vendre | affichage | exit): ");
            String input = sc.nextLine();

            switch (input) {
                case "ajouter":
                    medicaments.ajouter_Med();
                    break;
                case "vendre":
                    medicaments.vendreProduit();
                    break;

                case "affichage":
                    medicaments.afficherMedicaments();
                    break;
                case "exit":
                    keepLooping = false;
                    break;
                // suppression, recette journaliere...
                default:
                    System.out.println("Tache inconnu, veuillez réssayer.");
                    break;
            }
        }
        // Should save program state here
        System.out.println("A bientot!");
    }
}
