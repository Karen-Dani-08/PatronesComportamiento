# Template Method · Reportes de notas

Programación I · Patrones de comportamiento · Universidad Libre

## Carpetas

| Carpeta | Qué contiene |
|---|---|
| `00-inicio` | `ReporteTexto`, `ReporteCSV` y `ReporteHTML` repiten el mismo algoritmo, cada uno a su manera. |
| `01-template-method` | La clase abstracta `Reporte` fija el algoritmo en `generar()`; cada subclase solo da formato. |

Los cambios están marcados con comentarios `// Paso N`.

## Compilar y ejecutar

```
cd src
javac *.java
java Main
```

## Síntoma que se observa en `00-inicio`

Carlos Perez (nota 3.0) aparece **APROBADO** en el texto y en el HTML, pero **REPROBADO** en el CSV: la regla de aprobación se copió tres veces y en una se escribió `>` en lugar de `>=`.

## Reto (`02-reto`)

Copie `01-template-method` como `02-reto` y agregue `ReporteMarkdown`, que produce una tabla en Markdown:

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
