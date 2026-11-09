package ejemplo_multihiloRunnable;

import Ejemplo_multihiloThread.Coche;

public class Main {

	public static void main(String[] args) {
		Coche coche1 = new Coche("+");
		Coche coche2 = new Coche("@ ");
		Coche coche3 = new Coche(" -");
		
		coche1.start();
		coche2.start();
		coche3.start();
		
		//Thread t1 = new Thread(coche1);
		//Thread t2 = new Thread(coche2);
		//Thread t3 = new Thread(coche3);
		//t1.start();
		//t2.start();
		//t3.start();
		while(true) {
			System.out.println("*");
		}

	}

}