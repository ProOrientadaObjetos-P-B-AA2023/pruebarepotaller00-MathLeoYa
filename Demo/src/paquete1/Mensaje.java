
package paquete1;

public class Mensaje {

    public static String obtenerFrase() {
        return String.format("%s, una ciudad llena de arte y naturaleza", Palabra.obtenerPalabra());
    }
}
