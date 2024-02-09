package utils;

public enum Estado {

    NUEVO(0.1), SEMINUEVO(0.05), USADO(0.0);

    private double incremento;

    Estado(double incremento) {
        this.incremento = incremento;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
}
