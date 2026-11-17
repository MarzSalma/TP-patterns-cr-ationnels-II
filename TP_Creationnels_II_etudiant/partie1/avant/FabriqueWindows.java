public class FabriqueWindows implements FabriqueUI {
    @Override
    public Bouton creerBouton() {
        return new BoutonWindows();
    }

    @Override
    public ChampTexte creerChampTexte() {
        return new ChampWindows();
    }
}
