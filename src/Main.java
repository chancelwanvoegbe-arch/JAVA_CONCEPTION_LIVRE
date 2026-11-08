public class Main {
    public static void main(String[] args) {

        Livre L1 = new Livre("HIGH", "KAFKA", 2017, "Saint-claude", 400, 100.00);
        Livre L2 = new Livre("MEDIUM", "Les misérables", 2016, "Saint-Antoine", 100, 90.00);
        Livre L3 = new Livre("HIGH", "KAFKA", 2017, "Saint-claude", 200, 100.00);

        // Test afficher()
        System.out.println("\n=== Affichage ===\n");
        L1.afficher();
        System.out.println("\n");
        L2.afficher();
        System.out.println("\n");
        L3.afficher();

        // Test estLong()
        System.out.println("\n=== Test estLong ===\n");
        Livre [] Liste = {L1, L2,L3};

        for (Livre contenu : Liste){
            if (contenu.estLong()) {
                System.out.println(""+contenu.titre+"est un livre long.");
            } else {
                System.out.println(""+contenu.titre+"est un livre court.");
            }
        }



        System.out.println("\n=== Test Remise 10% ===");
        L1.appliquerRemise(10);


        System.out.println("\n=== Test Remise 80% (invalide) ===");
        L1.appliquerRemise(80);


        System.out.println("\n=== Nouvel affichage après remise ===");
        L1.afficher();
    }
}