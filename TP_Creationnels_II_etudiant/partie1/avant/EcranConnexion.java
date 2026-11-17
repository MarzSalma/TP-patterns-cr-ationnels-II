public class EcranConnexion {
    private final FabriqueUI fabrique;

    public EcranConnexion(FabriqueUI fabrique) {
        this.fabrique = fabrique;
    }

    public void afficher() {
        ChampTexte champ = fabrique.creerChampTexte();
        Bouton bouton = fabrique.creerBouton();
        System.out.println("--- Connexion ---");
        champ.afficher();
        bouton.afficher();
    }
}
