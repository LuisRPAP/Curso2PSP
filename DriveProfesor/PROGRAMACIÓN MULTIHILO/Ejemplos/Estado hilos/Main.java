package paquetePrincipal;



import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HiloAuxiliar hilo1 = new HiloAuxiliar();
        System.out.println("Hilo Auxiliar Nuevo: Estado=" + hilo1.getState());
        
        hilo1.start();
        System.out.println("Hilo Auxiliar Iniciado: Estado=" + hilo1.getState());

        System.out.println("Esperamos a que termine el hilo");
        hilo1.join(); // 👈 Esperamos a que termine

        System.out.println("Hilo Auxiliar Muerto: Estado=" + hilo1.getState());
    }
}