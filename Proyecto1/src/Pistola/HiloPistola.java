package Pistola;

public class HiloPistola extends Thread {

	Pistola p1;

	public  void run()	{
		
		
		try {
			p1.disparar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.cargar();
		
	}
}
