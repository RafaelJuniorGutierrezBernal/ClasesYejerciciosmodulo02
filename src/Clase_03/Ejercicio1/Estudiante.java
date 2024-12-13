package Clase_03.Ejercicio1;

public class Estudiante {
    public String nombre;
    public int edad;
    public double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    public void mostrarDetalles(){
        System.out.println("El nombre del estudiantes es: " +this.nombre);
        System.out.println("La edad del estudiante es: " +this.edad);
        System.out.println("El promedio Final es: " +this.promedio);
    }
    public void esAprobado(double promedio){
      
        if (promedio >= 3.0) {
            System.out.println("Fue aprobado con: "+ promedio);
        }else{
            System.out.println("No fue aprobado");
        }
    }


    
}
