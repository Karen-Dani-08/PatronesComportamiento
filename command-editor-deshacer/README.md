# Command · Editor de texto con deshacer

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

Después de `BORRAR 6`, el texto `" mundo"` ya no existe en ninguna parte. Después de `MAYUSCULAS`, nadie recuerda cómo estaba escrito antes. No hay forma de implementar Ctrl+Z.

## Reto

Implemente **rehacer** (Ctrl+Y):

1. Agregue a `Editor` una segunda lista, `deshechos`, y el método `rehacer()`.
2. Al deshacer, el comando pasa del historial a `deshechos`; al rehacer, vuelve a ejecutarse y regresa al historial.
3. Si se ejecuta un comando nuevo, `deshechos` se vacía.
4. No modifique ninguna clase de comando.
