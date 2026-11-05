import java.util.ArrayList;

public class CentroDeControl {
    // Paso 3: el centro solo conoce una lista de Suscriptor
    private ArrayList<Suscriptor> suscriptores = new ArrayList<>();

    // Paso 4: cualquiera se puede suscribir o retirar en tiempo de ejecucion
    public void suscribir(Suscriptor s) {
        suscriptores.add(s);
    }

    public void desuscribir(Suscriptor s) {
        suscriptores.remove(s);
    }

    // Paso 5: notificar es recorrer la lista
    public void reportar(Novedad novedad) {
        for (Suscriptor s : suscriptores) {
            s.actualizar(novedad);
        }
    }
}
