
public class Persona {

	private String nombre;

	private Cuenta cuenta;

	public Persona(String nombre, Cuenta c) {

		this.nombre = nombre;
		this.cuenta = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public synchronized void sacarDinero(int cantidad) throws InterruptedException {
		if (cuenta.getSaldo() <cantidad) {
			System.out.println(this.getNombre()+" está intentando sacar "+ cantidad + " €"+ " Saldo insuficiente. Recarga!");
			wait();
			cuenta.setSaldo(cuenta.getSaldo() - cantidad);
			System.out.println("Ahora sí,"+ this.getNombre() +" ha sacado "+ cantidad + " €");
			System.out.println("Ahora su saldo es de "+ cuenta.getSaldo());


		} else  {
			System.out.println(this.getNombre() +" Ha sacado " + cantidad );
			cuenta.setSaldo(cuenta.getSaldo()-cantidad);
			System.out.println("Su saldo es de "+ cuenta.getSaldo());
			
		}
	}

	public synchronized void ingresarDinero(int cantidad) {
		if(cuenta.getSaldo()== 0) {
			cuenta.setSaldo(cuenta.getSaldo() + cantidad);
			System.out.println(this.getNombre()+" ha recargado "+ cantidad);
			System.out.println("Ahora su saldo es de "+ cuenta.getSaldo());
			notifyAll();
		}else {
			cuenta.setSaldo(cuenta.getSaldo() + cantidad);
			System.out.println(this.getNombre()+ " recarga "+ cantidad +" más");
			System.out.println("Ahora su saldo es de "+ cuenta.getSaldo());
			notifyAll();
		}
		

	}
	public synchronized void consultarSaldo () {
		System.out.println("Su saldo es: "+ cuenta.getSaldo());
		
	}

}
