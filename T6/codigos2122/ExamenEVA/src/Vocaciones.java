public enum Vocaciones {
    ofensivo, defensivo, generico("ofensivo","defensivo");

    // caracteristica
    String ofensiva, defensiva;

    Vocaciones(String ofensiva, String defensiva) {
        this.ofensiva = ofensiva;
        this.defensiva = defensiva;
    }

    Vocaciones() {
    }

    public String getOfensiva() {
        return ofensiva;
    }

    public void setOfensiva(String ofensiva) {
        this.ofensiva = ofensiva;
    }

    public String getDefensiva() {
        return defensiva;
    }

    public void setDefensiva(String defensiva) {
        this.defensiva = defensiva;
    }
}
