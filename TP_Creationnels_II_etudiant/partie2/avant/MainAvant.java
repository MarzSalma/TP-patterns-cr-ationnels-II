public class MainAvant {
    public static void main(String[] args) {
        Email e1 = new Email("ali@it.tn", null, null,
                             "Examen", "Bonjour", false, true);

        Email e2 = new Email("sara@it.tn", "chef@it.tn", null,
                             "Rapport", "Voir PJ", true, false);

        Email e3 = new Email("Rapport", "Voir PJ", null,
                             "sara@it.tn", "chef@it.tn", true, false);

        Email e4 = new Email(null, null, null,
                             "Oubli", "Pas de destinataire", false, false);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
    }
}
