package co.com.hilos;

/**
 * @author Jonathan Castelblanco Higuera <jcastelblanco@sistemasenlinea.com.co>
 */
public class Generar extends Thread implements IHiloGenerador {

    private boolean activo = true;

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                System.out.println("Hilo Generador: Intento " + i + " de cambiar la variable activo");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.activo = false;
        System.out.println("Hilo Generador: variable activo cambiada a false");
    }

    @Override
    public boolean isActivo() {
        return this.activo;
    }
}
