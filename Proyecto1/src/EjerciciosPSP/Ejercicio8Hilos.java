package EjerciciosPSP;

//ASEGURARSE DE NO METER UNA CLASE DENTRO DE OTRA CLASE.
//DA ERROR Y ES DIFICIL DE VER.

//Clase externa que implementa Runnable para los números
	class Contador2 {
		public int contador = 0;

		public synchronized void incrementar() {

			contador++;
		}
	}

	class Incrementador1 implements Runnable {

		private Contador2 contador;

		public Incrementador1(Contador2 contador) {
			this.contador = contador;
		}

		@Override
		public  void run() {
			for (int i = 0; i < 10000; i++) {
				contador.incrementar();
			}
		}
	}


public class Ejercicio8Hilos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Crear las instancias de las clases que implementan Runnable
		Contador2 contador = new Contador2();

		Incrementador1 tarea1 = new Incrementador1(contador);
		Incrementador1 tarea2 = new Incrementador1(contador);

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