package estados;

// este metodo es para ver los estados de los hilos
// el el main vamos viendo los estados
public class HiloAuxiliar extends Thread {
	
	public void run()	{
		for (int i=10; i>=1;i--) {
			System.out.println(i+",");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
