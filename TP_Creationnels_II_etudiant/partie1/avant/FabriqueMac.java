public class FabriqueMac implements FabriqueUI {
    @Override
    public Bouton creerBouton() {
        return new BoutonMac();
    }

    @Override
    public ChampTexte creerChampTexte() {
        return new ChampMac();
    }
}
