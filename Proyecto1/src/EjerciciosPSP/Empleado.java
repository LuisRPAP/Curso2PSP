package EjerciciosPSP;

import EjercicciosPSP.Saludo;

public class Empleado extends Thread{
	String nombre;
	Saludo saludo;
		boolean esJefe;
		
	public Empleado (String nombre, Saludo saludo, boolean esJefe) {
	super();
	this.nombre=nombre;
	this.saludo=saludo;
	this.esJefe=esJefe;
	
	}
	public void run() {
		
		System.out.println(nombre+" acaba de llegar");
		
		if (esJefe) {
			saludo.saludoJefe(nombre);
		}else {
			saludo.saludoEmpleado(nombre);
		}
	}
	}
