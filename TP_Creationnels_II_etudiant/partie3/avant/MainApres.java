import java.util.ArrayList;
import java.util.List;

public class MainApres {
    public static void main(String[] args) {
        RegistreModeles registre = new RegistreModeles();


        Brouillon modele = new Brouillon("Bienvenue", "Bonjour,", new ArrayList<>(List.of("charte.pdf")));
        registre.enregistrer("bienvenue", modele);


        Brouillon b1 = registre.creer("bienvenue");
        b1.setObjet("Relance");
        b1.getPiecesJointes().add("facture.pdf");

        Brouillon b2 = registre.creer("bienvenue");


        System.out.println(modele);
        System.out.println(b1);
        System.out.println(b2);
    }
}
