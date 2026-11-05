# Command · Editor de texto con deshacer

Programación I · Patrones de comportamiento · Universidad Libre

## Carpetas

| Carpeta | Qué contiene |
|---|---|
| `00-inicio` | `Editor.ejecutar(String, String)` aplica la acción y la olvida; `deshacer()` no puede hacer nada. |
| `01-command` | Cada acción es un objeto `Comando` con `ejecutar()` y `deshacer()`; el editor guarda un historial. |

Los cambios están marcados con comentarios `// Paso N`.

## Compilar y ejecutar

```
cd 00-inicio
javac *.java
java Main
```

## Síntoma que se observa en `00-inicio`

Después de `BORRAR 6`, el texto `" mundo"` ya no existe en ninguna parte. Después de `MAYUSCULAS`, nadie recuerda cómo estaba escrito antes. No hay forma de implementar Ctrl+Z.

## Reto (`02-reto`)

Copie `01-command` como `02-reto` e implemente **rehacer** (Ctrl+Y):

1. Agregue a `Editor` una segunda lista, `deshechos`, y el método `rehacer()`.
2. Al deshacer, el comando pasa del historial a `deshechos`; al rehacer, vuelve a ejecutarse y regresa al historial.
3. Si se ejecuta un comando nuevo, `deshechos` se vacía.
4. No modifique ninguna clase de comando.
