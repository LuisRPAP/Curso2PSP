package EjerciciosPSP;

public class Ejercicio10Hilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrioridadMaxima TareaA = new PrioridadMaxima("Hilo A");
		PrioridadMaxima TareaB = new PrioridadMaxima("Hilo B");

		Thread hiloA = new Thread(TareaA);
		Thread hiloB = new Thread(TareaB);
		hiloA.setPriority(Thread.MAX_PRIORITY);
		hiloB.setPriority(Thread.MIN_PRIORITY);
		
		
		
		hiloB.start();

		hiloA.start();
		
	}

}

class PrioridadMaxima implements Runnable {
	private String nombre;

	public PrioridadMaxima(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++){
			System.out.println("Estoy en la tarea :" + nombre + "  Interaccion : "+i);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
