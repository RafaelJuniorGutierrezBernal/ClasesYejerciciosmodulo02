package Clase_03.Ejercicio3;

public interface MetodoPago {

    	public void procesarPago(double monto);

        public String obtenerDetalles();

        public boolean validarMonto(double monto);
}
