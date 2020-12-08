package co.com.hilos;

/**
 * @author Jonathan Castelblanco Higuera <jocastelblanco3@poligran.edu.co>
 */
public class Consumir extends Thread {

    private IHiloGenerador hiloGenerador;

    public Consumir(IHiloGenerador hiloGenerador) {
        this.hiloGenerador = hiloGenerador;
    }

    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("Hilo Consumidor: verificando valor de variable activo");
            if(this.hiloGenerador.isActivo()){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                break;
            }
        }
        System.out.println("Hilo Consumidor: El valor de la variable activo es " + hiloGenerador.isActivo());
    }
}
