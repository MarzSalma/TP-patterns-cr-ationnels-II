public class EcranParametres {
    private final FabriqueUI fabrique;

    public EcranParametres(FabriqueUI fabrique) {
        this.fabrique = fabrique;
    }

    public void afficher() {
        ChampTexte champ = fabrique.creerChampTexte();
        Bouton bouton = fabrique.creerBouton();
        System.out.println("--- Parametres ---");
        champ.afficher();
        bouton.afficher();
    }
}
