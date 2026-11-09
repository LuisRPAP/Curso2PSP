package WaitNotify;

public class Main {

	public static void main(String[] args) {
		
		// Objeto en común, se encarga del wait y notify
		Saludo saludo = new Saludo();

		
		Empleado empl1 = new Empleado("Pepe",saludo,false);
		Empleado empl2 = new Empleado("Luis",saludo,false);
		Empleado empl3 = new Empleado("Maria",saludo,false);
		Empleado jefe1 = new Empleado("JEFE",saludo,true);


		// Lanzo los hilos
		
		empl1.start();
		empl2.start();
		empl3.start();
		jefe1.start();
		
	}

}
