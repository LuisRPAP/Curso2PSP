package EjercicioHilosCompartidos;

import java.util.ArrayList;
import java.util.Scanner;

public class Recurso extends Thread {
ArrayList<String> dato=new ArrayList<>();
Thread hilo=new Thread();
Scanner sc=new Scanner(System.in);

	
	public synchronized void añadir(String dato,Thread hilo,Scanner sc) {
		this.dato=dato;
		this.hilo=hilo;
		
				
		System.out.println("Introduzca un numero;");
		dato=sc.nextLine();
		ArrayList<String> lista;
		lista.add(dato);
		System.out.println("El hilo: "+hilo.getName()+"Ingresa el numero "+dato);
	}
	public void run() {
		
		añadir();
		
		
	}
	
	
}
