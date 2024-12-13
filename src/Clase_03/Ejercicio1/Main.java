package Clase_03.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Estudiante>estudiantes = new ArrayList<>();
        
        Estudiante estudiante1 = new Estudiante("Rafa", 20, 3.5);
        Estudiante estudiante2 = new Estudiante("Juan", 20, 3.0);
        Estudiante estudiante3 = new Estudiante("Jose", 18, 2.0);

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarDetalles();
            estudiante.esAprobado(estudiante.promedio);
        }
    }
    


}
