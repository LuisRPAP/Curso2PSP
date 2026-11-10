package PiscinaHilosBar;

import java.util.ArrayList;

public class Hilos implements Runnable {
	int cliente;
	
	
	
	public Hilos(int cliente) {
		
		this.cliente=cliente;
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println ("Bienvenidos a Los Hilos Dorados cliente numero: "+this.cliente+"\n se esta atendiendo su comanda " + Thread.currentThread().getName());
		try {
			Thread.sleep((long)(Math.random() * 3000) + 1000);

		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Se ha terminado la comanda: "+Thread.currentThread().getName()+"\n del cliente "+ this.cliente);
		
	}
	
	
	
}
