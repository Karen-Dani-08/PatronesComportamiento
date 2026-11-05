public class Main {
    public static void main(String[] args) {
        CentroDeControl centro = new CentroDeControl();

        Suscriptor pantalla = new PantallaEstacion("Portal Norte");
        Suscriptor app = new AppMovil();
        Suscriptor redSocial = new CuentaRedSocial();

        // Paso 6: Main arma las suscripciones; el centro no sabe quienes son
        centro.suscribir(pantalla);
        centro.suscribir(app);
        centro.suscribir(redSocial);

        centro.reportar(new Novedad("Troncal Caracas", "Retraso de 10 minutos por alto flujo"));
        System.out.println();

        // De noche: la red social se retira sin tocar CentroDeControl
        centro.desuscribir(redSocial);
        centro.reportar(new Novedad("Troncal NQS", "Estacion Calle 75 cerrada por mantenimiento"));
    }
}
