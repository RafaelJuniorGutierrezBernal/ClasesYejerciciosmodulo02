package Clase_03.Ejercicio3;

public class TranseferenciaBancaria implements MetodoPago{

    private String numeroCuenta;

    
    public TranseferenciaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con transferencia bancaria");
    }

    @Override
    public String obtenerDetalles() {
        return "Transferencia Bancaria - Cuenta: " + numeroCuenta;
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0;
    }

}
