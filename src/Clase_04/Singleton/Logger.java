package Clase_04.Singleton;

public class Logger {

    private static Logger instancia;

    private Logger(){
    }

    public static Logger getInstancia(){
        if (instancia == null) {
             instancia = new Logger();
        }
        return instancia;
    }

    public void log(String message){
        System.out.println("[LOG]: "+ message);
    }

}
