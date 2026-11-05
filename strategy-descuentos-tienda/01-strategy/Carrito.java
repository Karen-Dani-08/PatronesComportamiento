import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();
    // Paso 3: el carrito TIENE una estrategia (composicion)
    private EstrategiaDescuento estrategia = new SinDescuento();

    public void agregar(Producto producto) {
        productos.add(producto);
    }

    // Paso 3: la estrategia se puede cambiar en tiempo de ejecucion
    public void setEstrategia(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (Producto p : productos) {
            subtotal += p.getSubtotal();
        }
        return subtotal;
    }

    // Paso 4: el carrito delega; ya no sabe que promociones existen
    public double calcularTotal() {
        return estrategia.aplicar(getSubtotal());
    }
}
