public class MainApres {
    public static void main(String[] args) {
        String os = "MAC";
        FabriqueUI fabrique;

        switch (os) {
            case "WINDOWS":
                fabrique = new FabriqueWindows();
                break;
            case "MAC":
                fabrique = new FabriqueMac();
                break;
            default:
                throw new IllegalArgumentException("OS inconnu");
        }

        EcranConnexion ecranConnexion = new EcranConnexion(fabrique);
        ecranConnexion.afficher();

        EcranParametres ecranParametres = new EcranParametres(fabrique);
        ecranParametres.afficher();
    }
}
