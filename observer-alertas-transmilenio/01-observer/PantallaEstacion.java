// Paso 2: cada canal implementa Suscriptor
public class PantallaEstacion implements Suscriptor {
    private String estacion;

    public PantallaEstacion(String estacion) {
        this.estacion = estacion;
    }

    @Override
    public void actualizar(Novedad novedad) {
        System.out.println("Pantalla " + estacion + " -> " + novedad);
    }
}
