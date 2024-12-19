package Clase_05.Composite;

public class TarjetaMadre {

    private Procesador procesador;
    private Memoria memoria;
    private Almacenamiento almacenamiento;
    private Grafica grafica;
    public TarjetaMadre(){
        this.almacenamiento = new Almacenamiento(0);
        this.memoria = new Memoria(0);
        this.procesador = new Procesador(0);
        this.grafica = new Grafica(0);
    }

    public void getMotherBoardComponents(){
        System.out.println("Componentes de la motherboard");
        almacenamiento.mostrarDetalles();
        memoria.mostrarDetalles();
        procesador.mostrarDetalles();
        grafica.mostrarDetalles();
    }
    
}
