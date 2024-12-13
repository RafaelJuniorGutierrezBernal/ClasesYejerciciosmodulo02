package Clase_03.Ejercicio3;

public class TarjetaCredito implements MetodoPago{
    private String numeroTarjeta;
    private String titular;

    

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con tarjeta de credito");
    }

    @Override
    public String obtenerDetalles() {
        return "Tarjeta de Credito: " + numeroTarjeta + ", Titular: " + titular;
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0 && monto <= 10000;
    }

}
