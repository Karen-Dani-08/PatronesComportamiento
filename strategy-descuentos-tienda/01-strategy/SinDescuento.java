// Paso 2: cada promocion es una clase
public class SinDescuento implements EstrategiaDescuento {
    @Override
    public double aplicar(double subtotal) {
        return subtotal;
    }
}
