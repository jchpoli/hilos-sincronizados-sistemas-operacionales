package co.com.hilos;

/**
 * @author Jonathan Castelblanco Higuera <jocastelblanco3@poligran.edu.co>
 */
public class Limpiar {

    private Generar hiloGenerador;
    private Consumir hiloConsumidor;

    public Limpiar() {
        System.out.println("Clase limpiar: Creando instancias de hilos");
        this.hiloGenerador = new Generar();
        this.hiloConsumidor = new Consumir(this.hiloGenerador);
    }

    public void sincronizarHilos() {
        System.out.println("Clase limpiar: Sincronizando hilos");
        this.hiloGenerador.start();
        try {
            this.hiloGenerador.join();
            this.hiloConsumidor.start();
            this.hiloConsumidor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
