import java.util.ArrayList;

public class ReporteCSV {
    public String generar(ArrayList<Estudiante> estudiantes) {
        String salida = "nombre,nota,estado\n";
        for (Estudiante e : estudiantes) {
            // SINTOMA: la regla de aprobacion se copio... y se copio mal
            String estado = e.getNota() > 3.0 ? "APROBADO" : "REPROBADO";
            salida += e.getNombre() + "," + e.getNota() + "," + estado + "\n";
        }
        // El CSV no lleva fila de promedio: se abre en Excel
        return salida;
    }
}
