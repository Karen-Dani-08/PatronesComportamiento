public class PantallaEstacion {
    private String estacion;

    public PantallaEstacion(String estacion) {
        this.estacion = estacion;
    }

    public void mostrar(Novedad novedad) {
        System.out.println("Pantalla " + estacion + " -> " + novedad);
    }
}
