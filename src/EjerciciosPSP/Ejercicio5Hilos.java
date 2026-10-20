package EjerciciosPSP;

public class Ejercicio5Hilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // 1. Crear las instancias de las clases que implementan Runnable
        Tarea tarea1 = new Tarea();
        
        
        // 2. Asociarlas a un objeto de tipo Thread
        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea1);
        
        // 3. Ejecutar los hilos con start()
        hilo1.start();
        hilo2.start();
        
        tarea1.run();
        
    }
}

// Clase externa que implementa Runnable para los números
class Tarea implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola desde el hilo: "+Thread.currentThread().getName());
        }
    }


 
	}


