package co.com.hilos;

/**
 * @author Jonathan Castelblanco Higuera <jcastelblanco@sistemasenlinea.com.co>
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando ejecución de programa");
        Limpiar limpiar= new Limpiar();
        limpiar.sincronizarHilos();
        System.out.println("Terminando ejecución de programa");
    }
}
