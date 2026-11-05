// Paso 2: cada canal implementa Suscriptor
public class CuentaRedSocial implements Suscriptor {
    @Override
    public void actualizar(Novedad novedad) {
        System.out.println("Red social    -> " + novedad);
    }
}
