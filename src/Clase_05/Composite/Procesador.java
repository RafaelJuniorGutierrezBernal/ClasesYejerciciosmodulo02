package Clase_05.Composite;

public class Procesador {
    private int capacidad;

    public Procesador(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void mostrarDetalles(){
        System.out.println("La memoria es de: " +this.capacidad+ " GHz");
    }
}
