package Clase_03.Ejercicio3;

public class Bitcoin implements MetodoPago {
    private String direccionWallet;

    public Bitcoin(String direccionWallet) {
        this.direccionWallet = direccionWallet;
    }
    

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con Bitcoin");
    }

    @Override
    public String obtenerDetalles() {
        return "Bitcoin - Direccion Wallet: " + direccionWallet;
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0;
    }
}
