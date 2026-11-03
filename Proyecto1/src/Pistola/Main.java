package Pistola;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiloPistola hilo1= new HiloPistola();
		HiloPistola hilo2= new HiloPistola();
		
		
		hilo1.start();
		System.out.println("el hilo esta "+ hilo1.getState());
		hilo2.start();
		System.out.println("el hilo esta "+ hilo2.getState());
	}
	

}
