import java.util.ArrayList;

public class ReporteTexto {
    public String generar(ArrayList<Estudiante> estudiantes) {
        String salida = "=== NOTAS PROGRAMACION I ===\n";
        double suma = 0;
        for (Estudiante e : estudiantes) {
            String estado = e.getNota() >= 3.0 ? "APROBADO" : "REPROBADO";
            salida += e.getNombre() + " ..... " + e.getNota() + "  " + estado + "\n";
            suma += e.getNota();
        }
        double promedio = Math.round(suma / estudiantes.size() * 10) / 10.0;
        salida += "Promedio del curso: " + promedio + "\n";
        return salida;
    }
}
