
public class Hilo implements Runnable{
	int id;

	public Hilo(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		
		// Mostramos un mensaje indicando el nombre del hilo
		System.out.println("El hilo "+ this.id + "coge el pool "+ Thread.currentThread().getName());
		
		// Bloqueamos el hilo un tiempo
		
		try {
			Thread.sleep((int)(Math.random()* 200*100) );
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		// Mensaje indicando que deja el pool
		System.out.println("El hilo "+ this.id + "deja el pool "+ Thread.currentThread().getName());
	}
	
	

}
