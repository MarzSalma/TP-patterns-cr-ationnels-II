import java.util.ArrayList;
import java.util.List;

public class MainAvant {
    public static void main(String[] args) {
        Brouillon modele = new Brouillon("Bienvenue", "Bonjour,",
                new ArrayList<>(List.of("charte.pdf")));


        Brouillon b1 = new Brouillon(modele.getObjet(), modele.getCorps(),
                                     modele.getPiecesJointes());
        b1.setObjet("Relance");
        b1.getPiecesJointes().add("facture.pdf");

        System.out.println(modele);
        System.out.println(b1);
    }
}
