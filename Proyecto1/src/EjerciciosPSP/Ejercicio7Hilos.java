package EjerciciosPSP;
// ASEGURARSE DE NO METER UNA CLASE DENTRO DE OTRA CLASE.
// DA ERROR Y ES DIFICIL DE VER.

//Clase externa que implementa Runnable para los números
	class Contador {
		public int contador = 0;

		public void incrementar() {

			contador++;
		}
	}

	class Incrementador implements Runnable {

		private Contador contador;

		public Incrementador(Contador contador) {
			this.contador = contador;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				contador.incrementar();
			}
		}
	}


public class Ejercicio7Hilos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Crear las instancias de las clases que implementan Runnable
		Contador contador = new Contador();

		Incrementador tarea1 = new Incrementador(contador);
		Incrementador tarea2 = new Incrementador(contador);

		// 2. Asociarlas a un objeto de tipo Thread
		Thread hilo1 = new Thread(tarea1);
		Thread hilo2 = new Thread(tarea2);

		// 3. Ejecutar los hilos con start()
		hilo1.start();
		hilo2.start();
		
		try {
			hilo1.join();
			hilo2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		System.out.println("Valor final: " + contador.contador);

	}

}
