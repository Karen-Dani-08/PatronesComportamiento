public class BonoFijo implements EstrategiaDescuento {
    double compraMinima;
    double monto;

    public BonoFijo (double compraMinima, double monto) {
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