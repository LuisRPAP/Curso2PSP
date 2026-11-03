package Pistola;

public class HiloPistola extends Thread {

	Pistola p1;

	public  void run()	{
		
		
		p1.disparar();
		p1.cargar();
		
	}
}
