package EjerciciosPSP;

public class Ejercicio12Hilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cuando llega el jefe le saludan los empleados, 
		//pero si llegan los empleados antes entonces esperan a que llegue el jefe.
		
	Saludo saludo = new Saludo();
	
	Empleado e1 = new Empleado ("Pepe",saludo,false);
	Empleado e2 = new Empleado ("Luis",saludo,false);
	Empleado e3 = new Empleado ("Marcos",saludo,false);
	Empleado jefe = new Empleado ("Jefe",saludo,true);
	
	// lanzo hilos
	e1.start();
	e2.start();
	e3.start();
	jefe.start();
	
	}
}
