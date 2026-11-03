package EjerciciosPSP;

public class EjercicioMultiplicar extends Thread {

	private int num;
	public EjercicioMultiplicar (int num) {
		this.num=num;
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void run() {
		System.out.println("************ Tabla del " + this.getNum() + "********");
				for (int i=0;i<=10;i++) {
					System.out.println(num + " X "+ i + " = "+ i*num);
					
				}
	}
}
