import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		
		// Creamos un pool usando newFixedThread que crea un pool
		// de hilos con el numero de hilos que le pasamos
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		/*
		Hilo h1 = new Hilo (2);
		Hilo h2 = new Hilo (3);
		Hilo h3 = new Hilo (4);
		
		executor.execute(h1);
		executor.execute(h2);
		executor.execute(h3);
		*/
		
		for (int i = 0; i < 100; i++) {
			executor.execute(new Hilo(i));
			
		}
		
		// Finalizamos el executor.shutdown()
		executor.shutdown();
	}

}
