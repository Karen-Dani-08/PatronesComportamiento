# Observer · Alertas de TransMilenio

Programación I · Patrones de comportamiento · Universidad Libre

> Las novedades son datos de ejemplo para el ejercicio; no corresponden a reportes reales.

## Carpetas

| Carpeta | Qué contiene |
|---|---|
| `00-inicio` | `CentroDeControl` crea y llama uno por uno a la pantalla, la app y la red social. |
| `01-observer` | Los canales implementan `Suscriptor`; el centro solo recorre una lista. |

Los cambios están marcados con comentarios `// Paso N`.

## Compilar y ejecutar

```
cd 00-inicio
javac *.java
java Main
```

## Síntoma que se observa en `00-inicio`

- Para apagar la red social de noche hay que modificar `CentroDeControl`.
- Para agregar alertas por SMS también hay que modificar `CentroDeControl`.

## Reto (`02-reto`)

Copie `01-observer` como `02-reto` y agregue `AlertaSMS`:

1. Recibe en el constructor un número de celular y **una troncal**.
2. Solo imprime las novedades de su troncal, por ejemplo: `SMS 300 123 4567 -> [Troncal NQS] ...`
3. No modifique `CentroDeControl`.
4. Pregunta: ¿quién decide qué novedades le interesan al SMS: el centro o el suscriptor?
