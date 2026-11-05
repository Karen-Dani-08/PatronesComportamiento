public class Main {
    public static void main(String[] args) {
        CentroDeControl centro = new CentroDeControl();

        centro.reportar(new Novedad("Troncal Caracas", "Retraso de 10 minutos por alto flujo"));
        System.out.println();

        // Requisito nuevo: de noche la red social NO debe publicar.
        // Requisito nuevo: agregar alertas por SMS.
        // Con este diseno, ambos obligan a editar CentroDeControl.
        centro.reportar(new Novedad("Troncal NQS", "Estacion Calle 75 cerrada por mantenimiento"));
    }
}
