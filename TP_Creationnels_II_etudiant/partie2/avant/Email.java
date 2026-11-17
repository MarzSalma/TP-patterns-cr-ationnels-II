public class Email {
    private final String destinataire;
    private final String copie;
    private final String copieCachee;
    private final String objet;
    private final String corps;
    private final boolean accuseReception;
    private final boolean urgent;

    private Email(Builder builder) {
        this.destinataire = builder.destinataire;
        this.copie = builder.copie;
        this.copieCachee = builder.copieCachee;
        this.objet = builder.objet;
        this.corps = builder.corps;
        this.accuseReception = builder.accuseReception;
        this.urgent = builder.urgent;
    }

    public static class Builder {
        private final String destinataire;
        private String copie = null;
        private String copieCachee = null;
        private String objet = "(sans objet)";
        private String corps = null;
        private boolean accuseReception = false;
        private boolean urgent = false;

        public Builder(String destinataire) {
            if (destinataire == null || destinataire.isEmpty()) {
                throw new IllegalArgumentException("Destinataire obligatoire");
            }
            this.destinataire = destinataire;
        }

        public Builder copie(String copie) {
            this.copie = copie;
            return this;
        }

        public Builder copieCachee(String copieCachee) {
            this.copieCachee = copieCachee;
            return this;
        }

        public Builder objet(String objet) {
            this.objet = objet;
            return this;
        }

        public Builder corps(String corps) {
            this.corps = corps;
            return this;
        }

        public Builder accuseReception(boolean accuseReception) {
            this.accuseReception = accuseReception;
            return this;
        }

        public Builder urgent(boolean urgent) {
            this.urgent = urgent;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }

    @Override public String toString() {
        return "Email[to=" + destinataire + ", cc=" + copie
             + ", objet=" + objet + ", accuse=" + accuseReception
             + ", urgent=" + urgent + "]";
    }
}
