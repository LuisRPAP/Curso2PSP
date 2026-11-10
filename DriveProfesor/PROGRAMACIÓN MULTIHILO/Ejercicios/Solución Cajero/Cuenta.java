
public class Cuenta {
	private String nombre;
	private int saldo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// 
	public synchronized int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Cuenta(String nombre, int saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}

	

	

}
