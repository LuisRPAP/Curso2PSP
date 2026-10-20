package EjerciciosPSP;

public class Ejercicio6Hilos {

	public static void main(String[] args) throws InterruptedException {
		// En realidad hay que hacer un try - catch cuando colocas el Thread.sleep(), 
		//  pero haciendo el throws las excepciones las sacas del codigo y por eso funciona
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
        // 1. Crear las instancias de las clases que implementan Runnable
        Tarea1 tarea1 = new Tarea1();
        
        
        // 2. Asociarlas a un objeto de tipo Thread
        Thread hilo1 = new Thread(tarea1);
        
        
        // 3. Ejecutar los hilos con start()
       
        System.out.println("Al Inicio :" + hilo1.getState());
        hilo1.start();
       
        System.out.println("Tras empezar :" + hilo1.getState());
        
        Thread.sleep(1000);
        
        System.out.println("Tras pausa :" + hilo1.getState());
        hilo1.join();
        System.out.println("Tras Finalizar :" + hilo1.getState());
        
        
        
        
    }
}

// Clase externa que implementa Runnable para los números
class Tarea1 implements Runnable  {
    @Override
    public void run() {
    	try{
    		Thread.sleep(3000);
    	} catch (Exception e) {
    		System.out.println(e);
    		
    	}
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola desde el hilo: "+Thread.currentThread().getName());
        }
    }

}
