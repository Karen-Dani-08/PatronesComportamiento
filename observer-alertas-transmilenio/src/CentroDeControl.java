public class CentroDeControl {
    // SINTOMA: el centro conoce a cada canal por su nombre concreto
    private PantallaEstacion pantalla = new PantallaEstacion("Portal Norte");
    private AppMovil app = new AppMovil();
    private CuentaRedSocial redSocial = new CuentaRedSocial();

    public void reportar(Novedad novedad) {
        // Cada canal nuevo obliga a modificar este metodo
        pantalla.mostrar(novedad);
        app.enviarPush(novedad);
        redSocial.publicar(novedad);
    }
}
