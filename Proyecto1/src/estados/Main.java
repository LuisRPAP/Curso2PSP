package estados;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		HiloAuxiliar hilo1= new HiloAuxiliar();
		System.out.println("Hilo auxiliar nuevo: Estado "+ hilo1.getState());
		hilo1.start();
		System.out.println("Hilo auxiliar nuevo: Estado "+ hilo1.getState());
		hilo1.join();
		System.out.println("Hilo auxiliar nuevo: Estado "+ hilo1.getState());
	
	}

}
