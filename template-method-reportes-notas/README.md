# Template Method · Reportes de notas

Programación I · Patrones de comportamiento · Universidad Libre

## Código

El código del proyecto está en la carpeta `src`.

## Compilar y ejecutar

```
cd src
javac *.java
java Main
```

## Síntoma

Carlos Perez (nota 3.0) aparece **APROBADO** en el texto y en el HTML, pero **REPROBADO** en el CSV: la regla de aprobación se copió tres veces y en una se escribió `>` en lugar de `>=`.

## Reto

Agregue `ReporteMarkdown`, que produce una tabla en Markdown:

```
| Nombre | Nota | Estado |
|---|---|---|
| Ana Ruiz | 4.5 | APROBADO |
...
**Promedio:** 3.4
```

1. No modifique `Reporte`.
2. Agréguelo a la lista de `Main`: los cuatro reportes deben imprimirse con el mismo `for`.
3. Pregunta: si la nota mínima cambia a 3.5, ¿cuántos archivos hay que tocar ahora?
