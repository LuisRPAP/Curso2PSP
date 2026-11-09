package Ejemplo_multihiloThread;

public class Main {

	public static void main(String[] args) {
		Coche coche1 = new Coche(" ");
		Coche coche2 = new Coche("+ ");
		Coche coche3 = new Coche(" -");
		coche1.start();
		coche2.start();
		coche3.start();
		while(true) {
			System.out.println("*");
		}

	}

}
