package utils;

public enum Tactica {

    Defensiva(40, 70, 95),
    Ofensiva(95, 80, 20),
    Media(60, 90, 60);

    private int nivelAtaque, nivelDefensa, nivelMedio;

    Tactica(int nivelAtaque, int nivelMedio, int nivelDefensa) {
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelMedio = nivelMedio;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getNivelMedio() {
        return nivelMedio;
    }

    public void setNivelMedio(int nivelMedio) {
        this.nivelMedio = nivelMedio;
    }
}
