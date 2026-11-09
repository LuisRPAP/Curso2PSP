 package WaitNotify;

public class Saludo {
	private boolean hallegadoJefe;
	
	/* Si no es jefe, el empleado va a quedar esperando hasta que llegue el jefe.
	 Se hace wait del hilo que está corriendo y se bloquea,hasta que se le avise que ya
	 puede saludar
	 
	 */

	public Saludo() {
		
		this.hallegadoJefe = hallegadoJefe;
	}

	public boolean isHallegadoJefe() {
		return hallegadoJefe;
	}

	public void setHallegadoJefe(boolean hallegadoJefe) {
		this.hallegadoJefe = hallegadoJefe;
	}
	
	
	public synchronized void saludoEmpleado(String nombre) {
		
		try {
			
			if(!this.isHallegadoJefe()) {
				wait();
				System.out.println("\n"  +nombre.toUpperCase()+ " Buenos dias jefe");
			}else {
				System.out.println("\n"+ nombre.toUpperCase()+ " Disculpas por el retraso;");
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	// Si es jefe saluda y luego avisa a todos empleados para que saluden con el notifyall
	public synchronized void saludoJefe(String nombre) {
		
		System.out.println("\n ******"  +nombre+ "Buenos dias empleados ******");
		this.setHallegadoJefe(true);
		notifyAll();

	}

}
