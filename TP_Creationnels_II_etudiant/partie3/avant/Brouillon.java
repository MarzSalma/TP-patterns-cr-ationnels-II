import java.util.List;
import java.util.ArrayList;

public class Brouillon implements Copiable<Brouillon> {
    private String objet;
    private String corps;
    private final List<String> piecesJointes;

    public Brouillon(String objet, String corps, List<String> piecesJointes) {
        this.objet = objet;
        this.corps = corps;
        this.piecesJointes = piecesJointes;
    }

    public String getObjet()               { return objet; }
    public String getCorps()               { return corps; }
    public List<String> getPiecesJointes() { return piecesJointes; }
    public void setObjet(String objet)     { this.objet = objet; }

    @Override public String toString() {
        return "Brouillon[objet=" + objet + ", pj=" + piecesJointes + "]";
    }

    @Override
    public Brouillon copie() {
        return new Brouillon(this.objet, this.corps, new ArrayList<>(this.piecesJointes));
    }
}
