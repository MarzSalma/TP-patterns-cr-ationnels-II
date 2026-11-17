import java.util.HashMap;
import java.util.Map;

public class RegistreModeles {
    private final Map<String, Brouillon> modeles = new HashMap<>();

    public void enregistrer(String nom, Brouillon modele) {
        modeles.put(nom, modele);
    }

    public Brouillon creer(String nom) {
        if (!modeles.containsKey(nom)) {
            throw new IllegalArgumentException("Modèle inconnu : " + nom);
        }
        return modeles.get(nom).copie();
    }
}
