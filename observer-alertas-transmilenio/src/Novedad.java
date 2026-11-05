public class Novedad {
    private String troncal;
    private String mensaje;

    public Novedad(String troncal, String mensaje) {
        this.troncal = troncal;
        this.mensaje = mensaje;
    }

    public String getTroncal() {
        return troncal;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return "[" + troncal + "] " + mensaje;
    }
}
