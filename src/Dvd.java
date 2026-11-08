
public class Dvd extends Document {

    private String realisateur;
    private int dureeMinutes;

    public Dvd(String cote, String titre, int anneeParution, String realisateur, int duree) {
        super(cote, titre, anneeParution);
        this.realisateur = realisateur;
        this.dureeMinutes = duree;
    }


}
