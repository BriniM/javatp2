package io.brinim;

import java.util.Scanner;
import java.util.ArrayList;

class Gestionnaire {
    private ArrayList<Medicament> listeMedicaments;
    private Scanner sc;

    public Gestionnaire() {
        this.listeMedicaments = new ArrayList<>();
        this.sc = new Scanner(System.in);
    }

    public Medicament Rech_Med(String codeProduit) {
        for (var prod : this.listeMedicaments)
            if (prod.getCodeProduit().equals(codeProduit))
                return prod;

        return null;
    }

    public void ajouter_Med() {
        System.out.println("== Insertion d'un nouveau medicament ==");
        System.out.print("Donner le code du medicament: ");
        String codeMed = sc.nextLine();

        if (Rech_Med(codeMed) == null) {
            System.out.print("Donner le nom du medicament: ");
            String nomMed = sc.nextLine();

            System.out.print("Donner le prix unitaire: ");
            double pu = Double.parseDouble(sc.nextLine());

            System.out.print("Donner la quantité en stock: ");
            int qteStock = Integer.parseInt(sc.nextLine());

            if (this.listeMedicaments.add(new Medicament(codeMed, nomMed, pu, qteStock)))
                System.out.println("Medicament ajouté avec succès.");
            else
                System.out.println("Erreur lors de l'insertion du produit.");

        } else {
            System.out.println("Le produit existe déja.");
        }
    }

    public void afficherMedicaments() {
        if (this.listeMedicaments.isEmpty()) {
            System.out.println("Pas de medicaments.");
            return;
        }

        for (var med : this.listeMedicaments)
            System.out.println(String.format("%s - %s: Prix: %.3f, %d en stock.%n", med.getCodeProduit(),
                    med.getNomProduit(), med.getPrixUnitaire(), med.getQuantiteStock()));
    }

    public void vendreProduit() {
        System.out.print("Donner le code du medicament: ");
        String codeMed = sc.nextLine();

        Medicament med = Rech_Med(codeMed);

        if (med != null) {
            System.out.print("Donner la quantité a vendre: ");
            int qte = Integer.parseInt(sc.nextLine());

            if (med.getQuantiteStock() > qte) {
                System.out.println("Succés! A payer: " + qte * med.getPrixUnitaire());
                med.setQuantiteStock(med.getQuantiteStock() - qte);
            } else
                System.out.println("Quantité en stock insuffisante, il vous reste: " + med.getQuantiteStock());
        } else
            System.out.println("Produit introuvable");
    }
}
