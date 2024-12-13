package Clase_04.Factory;

public class FormaFactory {
    public static Forma getForma(TipoForma tipo  ) {
        switch (tipo) {
            case CIRCULO:
                return new Circulo();                
            case RECTANGULO:
                return new Rectangulo();
            case TRIANGULO:
                return new Triangulo();
            default:
                
                throw new IllegalArgumentException("Tipo de forma no reconocido");
        }
    }
}
