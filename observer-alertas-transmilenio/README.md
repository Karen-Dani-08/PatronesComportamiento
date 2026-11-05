# Observer · Alertas de TransMilenio

Programación I · Patrones de comportamiento · Universidad Libre

> Las novedades son datos de ejemplo para el ejercicio; no corresponden a reportes reales.

## Código

El código del proyecto está en la carpeta `src`.

## Compilar y ejecutar

```
cd src
javac *.java
java Main
```

## Síntoma

- Para apagar la red social de noche hay que modificar `CentroDeControl`.
- Para agregar alertas por SMS también hay que modificar `CentroDeControl`.

## Reto

Agregue `AlertaSMS`:

1. Recibe en el constructor un número de celular y **una troncal**.
2. Solo imprime las novedades de su troncal, por ejemplo: `SMS 300 123 4567 -> [Troncal NQS] ...`
3. No modifique `CentroDeControl`.
4. Pregunta: ¿quién decide qué novedades le interesan al SMS: el centro o el suscriptor?
