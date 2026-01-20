package Paint.vuecontrole;

public enum EnumOutil {
    PINCEAU,
    GOMME,
    FORME_CARRE,
    LIGNE,
    TRIANGLE,
    OVALE;


    @Override
    public String toString() {
        return this.name();
    }

}
