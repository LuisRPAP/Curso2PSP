package Pistola;

public class Pistola {

	static boolean cargador;

	public Pistola() {
		cargador = true ;

	}

	
	public synchronized void  disparar() throws InterruptedException {
		for (int i=40; i>=0;i--) {
			System.out.println("Quedan "+i+" disparos en el cargador");
			wait();
			
		}
		cargador=false;
		
		
	}
	public synchronized void cargar() {
		if(!cargador) {
		System.out.println("Cargando");
		
		}else {
			System.out.println("Arma Cargada");
			
		}
		cargador=true;
		notify();
		
	}

}
