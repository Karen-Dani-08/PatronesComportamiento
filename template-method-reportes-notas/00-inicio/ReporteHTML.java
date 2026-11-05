import java.util.ArrayList;

public class ReporteHTML {
    public String generar(ArrayList<Estudiante> estudiantes) {
        String salida = "<table>\n<tr><th>Nombre</th><th>Nota</th><th>Estado</th></tr>\n";
        double suma = 0;
        for (Estudiante e : estudiantes) {
            String estado = e.getNota() >= 3.0 ? "APROBADO" : "REPROBADO";
            salida += "<tr><td>" + e.getNombre() + "</td><td>" + e.getNota()
                    + "</td><td>" + estado + "</td></tr>\n";
            suma += e.getNota();
        }
        double promedio = Math.round(suma / estudiantes.size() * 10) / 10.0;
        salida += "<tr><td>Promedio</td><td>" + promedio + "</td><td></td></tr>\n</table>\n";
        return salida;
    }
}
