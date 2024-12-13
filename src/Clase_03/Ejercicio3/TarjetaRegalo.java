package Clase_03.Ejercicio3;

public class TarjetaRegalo implements MetodoPago{
    private String codigo;

    public TarjetaRegalo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con tarjeta regalo");
    }

    @Override
    public String obtenerDetalles() {
        return "Tarjeta Regalo - Codigo: " + codigo;
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0 && monto <= 10000;
    }

}
