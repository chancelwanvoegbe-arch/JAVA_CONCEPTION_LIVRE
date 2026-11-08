public class Livre extends Document {

    private String auteur;
    private int nombrePages;
    private double prix; // n

    public Livre(String cote, String titre, int anneeParution, String auteur, int nombrePages, double prix) {
        super(cote, titre, anneeParution);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.prix = prix;
    }

    /
    public void afficher() {
        System.out.println("Le Livre a pour titre : " + titre + ", Auteur : " + auteur
                + ", comporte : " + nombrePages + " pages, paru en : " + anneeParution + ".");

        System.out.println("Le livre est disponible au prix de : " + prix + " DH.");
    }


    public boolean estLong() {
        return this.nombrePages > 300;
    }


    public void appliquerRemise(double pourcentage) {

        if (pourcentage < 0 || pourcentage > 50) {
            System.out.println("Erreur : La remise est négative ou supérieure à 50%.");
        } else {
            // Calcul du nouveau prix
            double montantRemise = (prix * pourcentage) / 100;
            double nouveauPrix = prix - montantRemise;

            System.out.println("Remise de " + pourcentage + "% appliquée.");
            System.out.println("Montant de la remise : " + montantRemise + " DH");
            System.out.println("Nouveau prix : " + nouveauPrix + " DH");

            this.prix = nouveauPrix;
        }
    }
}