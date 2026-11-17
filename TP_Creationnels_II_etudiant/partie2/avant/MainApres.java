public class MainApres {
    public static void main(String[] args) {
        try {
            Email e1 = new Email.Builder("ali@it.tn")
                    .objet("Examen")
                    .corps("Bonjour")
                    .urgent(true)
                    .build();

            Email e2 = new Email.Builder("sara@it.tn")
                    .copie("chef@it.tn")
                    .objet("Rapport")
                    .corps("Voir PJ")
                    .accuseReception(true)
                    .build();

            System.out.println(e1);
            System.out.println(e2);

            Email e3 = new Email.Builder("")
                    .objet("Erreur")
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Refusé : " + e.getMessage());
        }
    }
}
