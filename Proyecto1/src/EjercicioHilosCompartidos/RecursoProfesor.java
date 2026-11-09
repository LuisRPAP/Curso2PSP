package EjercicioHilosCompartidos;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa un recurso de datos al que varios hilos deben acceder de
 * forma concurrente
 * 
 * 
 */
public class RecursoProfesor {

	private ArrayList<Integer> datos;

	public RecursoProfesor(ArrayList<Integer> datos) {
		this.datos = datos;
	}

	/**
	 * Saca el último dato disponible del recurso compartido El método se marca como
	 * sincronizado para que solamente un hilo al mismo tiempo pueda invocarlo
	 * 
	 * Simulamos que obtener el dato conlleva cierto tiempo de procesamiento (con un
	 * sleep) y de esa manera podemos comprobar la diferencia entre hacer el método
	 * sincronizado y no hacerlo
	 * 
	 * @return El dato que saca del recurso
	 */
	public synchronized int addNumero() throws InterruptedException {

		System.out.println(" Introduce un número en el array");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		Thread.sleep(200);
		datos.add(numero);
		if (datos.size()== 4) {
			mostrarNumeros();
		}

		return numero;
	}

	public void mostrarNumeros() {
		System.out.println("Los números del array son: ");
		for (int i = 0; i < datos.size(); i++) {
			System.out.print(datos.get(i) + " - ");

		}
	}

}
