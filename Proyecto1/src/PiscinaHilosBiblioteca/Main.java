package PiscinaHilosBiblioteca;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import PiscinaHilosBiblioteca.Hilo;
//-	Se deben establecer el número de libros y de estudiantes. No por teclado.
//-	Dos estudiantes no pueden leer el mismo libro al mismo tiempo. Tienen que esperar a que el estudiante que tenga el libro deje de leer.
//-	Un estudiante no puede estar esperando tiempo infinito. Se deben establecer los tiempos de espera. Es decir un estudiante tiene un tiempo máximo para leer el libro.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for (int i = 1; i <= 40; i++) {
			executor.execute(new Hilo(i, null));
			
		}
		executor.shutdown();
	}

}
