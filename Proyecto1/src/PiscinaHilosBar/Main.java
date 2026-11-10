package PiscinaHilosBar;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//En el bar “Los Hilos Dorados” hay 3 camareros.
//Cada uno puede atender a un cliente a la vez.
//El bar tiene un aforo total de 40 personas, y todos quieren pedir una bebida.
//Cuando el bar abre, los clientes llegan y son atendidos por los camareros disponibles.
//Cada servicio tarda entre 1 y 4 segundos, y cuando terminan, el camarero queda libre para atender al siguiente cliente.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for (int i = 1; i <= 40; i++) {
			executor.execute(new Hilos(i));
			
		}
		executor.shutdown();
	}

}
