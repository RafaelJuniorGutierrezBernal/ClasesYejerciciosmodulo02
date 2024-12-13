package Clase_03.Ejercicio2;

public class Main {
    

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 200, 4);
       

        Moto moto = new Moto("Honda", "CBR", 180, false);

        carro.mostrarDetalles();
        System.out.println();
        moto.mostrarDetalles();
    }
}
