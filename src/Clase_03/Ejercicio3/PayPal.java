package Clase_03.Ejercicio3;

public class PayPal implements MetodoPago {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con PayPal");
    }

    @Override
    public String obtenerDetalles() {
        return "PayPal - Email: " + email;
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0;
    }

}
