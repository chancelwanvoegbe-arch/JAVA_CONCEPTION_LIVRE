public abstract class Document {
    protected String cote;
    protected String titre;
    protected int anneeParution;
    protected boolean disponible = true;

    public Document(String cote, String titre, int anneeParution) {
        this.cote = cote;
        this.titre = titre;
        this.anneeParution = anneeParution;
    }
    public boolean estDisponible() { return disponible; }

    public void emprunter() {
        if (!disponible) throw new IllegalStateException("Document déjà emprunté");
        disponible = false;
    }

    public void rendre() {
        disponible = true;
    }
}



