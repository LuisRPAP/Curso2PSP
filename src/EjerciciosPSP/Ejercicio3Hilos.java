package EjerciciosPSP;

public class Ejercicio3Hilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numero hilo1 = new numero() ;
		palabra hilo2 = new palabra();
		
		hilo1.start();
		hilo2.start();

		
		
	}

	

}
class numero extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	
}
class palabra extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			String[] letra= {"a","b","c","d","e","f","g","h","i","j"};
			System.out.println(letra[i]);
		}
	}
	
}
