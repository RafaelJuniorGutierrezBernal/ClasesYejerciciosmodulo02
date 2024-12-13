package Clase_04.Singleton;

import Clase_04.Factory.Forma;
import Clase_04.Factory.FormaFactory;
import Clase_04.Factory.TipoForma;

public class Main {
    public static void main(String[] args) {

        //Singleton
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();

        logger1.log("Se imprimio el pasaporte");
        logger2.log("Se imprimio la historia clinica");

        System.out.println(logger1);
        System.out.println(logger2);

        //Factory
        Forma forma1 = FormaFactory.getForma(TipoForma.CIRCULO);
        forma1.dibujar();
        Forma forma2 = FormaFactory.getForma(TipoForma.CIRCULO);
        forma2.dibujar();
        Forma forma3 = FormaFactory.getForma(TipoForma.CIRCULO);
        forma3.dibujar();



    }
}
