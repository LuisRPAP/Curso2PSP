package EjercicioHilosCompartidos;

import java.util.ArrayList;

/**
 * Clase que muestra como compartir un recurso entre dos hilos

 */
public class MainProfesor {

	private final static int CANTIDAD = 4;
	
	/*
	 * Lanza varios hilos que utilizan información de un mismo recurso compartido
	 * Se lanzan 4 hilos que utilizan información de un recurso compartido. Cada hilo pide por pantalla
	 * un número que será ingresado en un array de números.
	 * Mostrará el nombre del hilo y el número que ingresa. Al terminar muestra los números del array.
	 */
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Integer> datos = new ArrayList<Integer>();
		RecursoProfesor recurso = new RecursoProfesor(datos);
		
		/*
		ExecutorService executor = Executors.newFixedThreadPool(4);
		for (int i = 0; i < CANTIDAD; i++) {
			executor.execute(new Hilo(recurso));
			
		}
		executor.shutdown();
		*/
		
		// Genera datos para el recurso compartido
		for (int i = 0; i < CANTIDAD; i++) {
			new HilosProfesor (recurso).start();
		}
		
		
	
	}
}