package Clase_03.Ejercicio2;

public class Moto extends Vehiculo{ 

    public boolean tieneSidecar;
    
        public Moto(String marca, String modelo, int velocidadMaxima, boolean tieneSidecar) {
            super(marca, modelo, velocidadMaxima);
            this.tieneSidecar = tieneSidecar;
    }

        public boolean isTieneSidecar() {
            return tieneSidecar;
        }

        public void setTieneSidecar(boolean tieneSidecar) {
            this.tieneSidecar = tieneSidecar;
        }
        
        @Override
        public void mostrarDetalles() {
            super.mostrarDetalles();
            System.out.println("Tiene sidecar: " + tieneSidecar);
        }
}
