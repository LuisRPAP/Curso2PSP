package ejemplo_multihiloRunnable;

public class Coche implements Runnable{
	private String simbolo;
	
	
	public Coche(String simbolo) {
		super();
		this.simbolo = simbolo;
	}


	public String getSimbolo() {
		return simbolo;
	}


	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}


	@Override
	public void run() {
		while(true) {
			System.out.println(simbolo);
		}
	}

}
