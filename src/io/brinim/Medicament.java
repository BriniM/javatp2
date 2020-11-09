package io.brinim;

class Medicament {
    private String codeMedicament;
    private String nomMedicament;
    private double prixUnitaire;
    private int quantiteStock;

    public Medicament(String codeMedicament, 
        String nomMedicament, 
        double prixUnitaire, 
        int quantiteStock) {
            this.codeMedicament = codeMedicament;
            this.nomMedicament = nomMedicament;
            this.prixUnitaire = prixUnitaire;
            this.quantiteStock = quantiteStock;
    }

    public String getCodeProduit() {
        return codeMedicament;
    }

    public String getNomProduit() {
        return nomMedicament;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setCodeProduit(String codeMedicament) {
        this.codeMedicament = codeMedicament;
    }

    public void setNomProduit(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }
}
