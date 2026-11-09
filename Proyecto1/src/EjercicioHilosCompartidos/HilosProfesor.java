package EjercicioHilosCompartidos;
import java.util.Scanner;
public class HilosProfesor extends Thread {
	

	

		
		private RecursoProfesor recurso;
		
		public HilosProfesor(RecursoProfesor recurso) {
			this.recurso = recurso;
		}
		/*
		 * Tarea que desempeña el hilo. En este caso de forma simbólica 
		 * pinta una serie de líneas por pantalla
		 
		 */
		@Override
		public void run() {
			
			int dato;
			try {
				dato = recurso.addNumero();
				System.out.println(getName() + " - " + dato);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
				
			
		}
	}


