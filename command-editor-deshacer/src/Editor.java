public class Editor {
    private Documento doc;

    public Editor(Documento doc) {
        this.doc = doc;
    }

    // Cada accion es un texto; se ejecuta y se olvida
    public void ejecutar(String accion, String argumento) {
        if (accion.equals("ESCRIBIR")) {
            doc.insertar(argumento);
        } else if (accion.equals("BORRAR")) {
            doc.borrar(Integer.parseInt(argumento));
        } else if (accion.equals("MAYUSCULAS")) {
            doc.setContenido(doc.getContenido().toUpperCase());
        }
    }

    // SINTOMA: cual fue la ultima accion? que texto se borro?
    // Nadie lo guardo, asi que no hay forma de revertirla.
    public void deshacer() {
        System.out.println("  (no se puede deshacer)");
    }
}
