public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento();
        Editor editor = new Editor(doc);

        editor.ejecutar("ESCRIBIR", "Hola");
        editor.ejecutar("ESCRIBIR", " mundo");
        mostrar(doc);
        editor.ejecutar("BORRAR", "6");
        mostrar(doc);
        editor.ejecutar("MAYUSCULAS", "");
        mostrar(doc);

        // Requisito nuevo: Ctrl+Z
        editor.deshacer();
        mostrar(doc);
    }

    static void mostrar(Documento doc) {
        System.out.println("\"" + doc.getContenido() + "\"");
    }
}
