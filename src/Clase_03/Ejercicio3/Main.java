package Clase_03.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<MetodoPago> metodoPagos = new ArrayList<>();

        metodoPagos.add(new TarjetaCredito("1234-5678-9012-3456", "John Doe"));
        metodoPagos.add(new PayPal("tZ0E8@example.com"));
        metodoPagos.add(new TranseferenciaBancaria("123456789"));
        metodoPagos.add(new Bitcoin("1A1zP1eP5QGefi2DMPTfTL5SLm"));
        metodoPagos.add(new TarjetaRegalo("REGALO01234"));

        double montoAPagar = 1500;

        for (MetodoPago metodo : metodoPagos) {

            if (metodo.validarMonto(montoAPagar)) {
                metodo.procesarPago(montoAPagar);
                System.out.println(metodo.obtenerDetalles());
            }else{
                System.out.println("El monto " + montoAPagar + " no es valido para " + metodo.obtenerDetalles());
            }
            System.out.println();
            
        }
    }
}
