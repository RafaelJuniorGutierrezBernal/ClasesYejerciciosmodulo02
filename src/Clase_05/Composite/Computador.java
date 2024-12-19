package Clase_05.Composite;

public class Computador {
    private TarjetaMadre tarjetaMadre;

    


    public Computador(TarjetaMadre tarjetaMadre) {
        this.tarjetaMadre = tarjetaMadre;
    }




    public void mostrarConfiguracion(){
        System.out.println("Configuracion de la PC: ");
        tarjetaMadre.getMotherBoardComponents();
    }
}
