package EjerciciosPSP;

public class Ejercicio1Hilos  {

	public static void main(String[]args) {
		
		System.out.println("Hilo actual: "+ Thread.currentThread());
		
		
		Thread hiloActual=Thread.currentThread();
		
		System.out.println("El hilo actual es : "+hiloActual.getName());
	}
	
}
