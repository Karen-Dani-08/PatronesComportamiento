// Paso 2: una estrategia tambien puede tener sus propios atributos
public class BonoFijo implements EstrategiaDescuento {
    private double monto;
    private double compraMinima;

    public BonoFijo(double monto, double compraMinima) {
        this.monto = monto;
        this.compraMinima = compraMinima;
    }

    @Override
    public double aplicar(double subtotal) {
        if (subtotal >= compraMinima) {
            return subtotal - monto;
        }
        return subtotal;
    }
}
