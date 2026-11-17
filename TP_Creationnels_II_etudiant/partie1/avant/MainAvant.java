public class MainAvant {
    public static void main(String[] args) {
        String os = "MAC";
        
        Bouton b1;
        ChampTexte c1;
        if (os.equals("WINDOWS")) {
            b1 = new BoutonWindows();
            c1 = new ChampWindows();
        } else if (os.equals("MAC")) {
            b1 = new BoutonMac();
            c1 = new ChampMac();
        } else {
            throw new IllegalArgumentException("OS inconnu");
        }
        System.out.println("--- Connexion ---");
        c1.afficher();
        b1.afficher();

        Bouton b2;
        ChampTexte c2;
        if (os.equals("WINDOWS")) {
            b2 = new BoutonWindows();
            c2 = new ChampWindows();
        } else if (os.equals("MAC")) {
            b2 = new BoutonMac();
            c2 = new ChampWindows();
        } else {
            throw new IllegalArgumentException("OS inconnu");
        }
        System.out.println("--- Parametres ---");
        c2.afficher();
        b2.afficher();
    }
}
