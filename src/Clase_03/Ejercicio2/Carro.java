package Clase_03.Ejercicio2;

public class Carro extends Vehiculo{

    public int numPuertas;
    
        public Carro(String marca, String modelo, int velocidadMaxima, int numPuertas) {
            super(marca, modelo, velocidadMaxima);
            this.numPuertas = numPuertas;
    }

        public int getNumPuertas() {
            return numPuertas;
        }

        public void setNumPuertas(int numPuertas) {
            this.numPuertas = numPuertas;
        }
    
        @Override
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Número de puertas: " + numPuertas);
        }
}
