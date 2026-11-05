# Strategy · Descuentos de una tienda en línea

Programación I · Patrones de comportamiento · Universidad Libre

## Carpetas

| Carpeta | Qué contiene |
|---|---|
| `00-inicio` | `Carrito.calcularTotal(String)` decide la promoción con un `if/else` sobre un texto. |
| `01-strategy` | Cada promoción es una clase que implementa `EstrategiaDescuento`; el carrito delega. |

Los cambios están marcados con comentarios `// Paso N`.

## Compilar y ejecutar

```
cd 00-inicio
javac *.java
java Main
```

## Síntoma que se observa en `00-inicio`

- Cada promoción nueva obliga a modificar `Carrito`.
- `calcularTotal("BLACKFRIDAY")` (mal escrito) devuelve el precio completo sin ningún error.

## Reto (`02-reto`)

Copie `01-strategy` como `02-reto` y agregue la promoción **Cumpleaños**: 15 % de descuento con un tope de $30.000.

1. No modifique `Carrito` ni las estrategias existentes.
2. Con el carrito de ejemplo ($249.000), el total debe ser **$219.000** (el 15 % serían $37.350, pero el tope es $30.000).
3. Pregunta: ¿cuántos archivos creó y cuántos modificó?
