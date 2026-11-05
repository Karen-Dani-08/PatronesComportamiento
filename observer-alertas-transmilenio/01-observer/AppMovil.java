// Paso 2: cada canal implementa Suscriptor
public class AppMovil implements Suscriptor {
    @Override
    public void actualizar(Novedad novedad) {
        System.out.println("Push app      -> " + novedad);
    }
}
