package Clase_05.Composite;

public class Grafica {
    private int capacidad;

    public Grafica(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void mostrarDetalles(){
        System.out.println("La memoria Grafica es de: " +this.capacidad+ " GB");
    }
}
