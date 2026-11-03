package EjerciciosPSP;

public class Saludo {
	private boolean hallegadoJefe;
	public Saludo() {
		this.hallegadoJefe=hallegadoJefe;
		
	}
	public boolean ishallegadoJefe() {
		return hallegadoJefe;
	}
	public boolean isHallegadoJefe() {
		return hallegadoJefe;
	}
	public void setHallegadoJefe(boolean hallegadoJefe) {
		this.hallegadoJefe = hallegadoJefe;
	}
	
public synchronized void saludoEmpleado(String nombre) {
	try{
	if(!this.ishallegadoJefe()) {
		
			wait();
			System.out.println(nombre.toUpperCase()+ " Buenos dias jefe");
		
	}else {
		System.out.println(nombre.toUpperCase()+ " Buenos dias jefe");
	}
	}catch(InterruptedException e ) {
		e.printStackTrace();
	}
}
public synchronized void saludoJefe(String nombre) {
	
	System.out.println(nombre.toUpperCase()+ " Buenos dias empleados");
	setHallegadoJefe(true);
	notifyAll();
	
}
}
