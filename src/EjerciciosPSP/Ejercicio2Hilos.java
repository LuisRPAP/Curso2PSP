package EjerciciosPSP;

public class Ejercicio2Hilos extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Ejercicio2Hilos alumno = new Ejercicio2Hilos();
		
		alumno.start();
		System.out.println("Hola desde mi primer hil2222222");
	
	}
	
	public void run() {
		System.out.println("Hola desde mi primer hilo");
	}

}
