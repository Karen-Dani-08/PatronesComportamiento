import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudiante> curso = new ArrayList<>();
        curso.add(new Estudiante("Ana Ruiz", 4.5));
        curso.add(new Estudiante("Carlos Perez", 3.0));
        curso.add(new Estudiante("Diana Gomez", 2.4));
        curso.add(new Estudiante("Felipe Rojas", 3.7));

        System.out.println(new ReporteTexto().generar(curso));
        System.out.println(new ReporteCSV().generar(curso));
        System.out.println(new ReporteHTML().generar(curso));
    }
}
