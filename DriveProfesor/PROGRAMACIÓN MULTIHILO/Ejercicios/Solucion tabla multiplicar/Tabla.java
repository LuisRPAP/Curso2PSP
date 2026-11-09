package tablaMultiplicar;

class Tabla extends Thread {
	 
	private int num;
 
	public void setNum(int num) {
		this.num = num;
	}
 
	public Tabla(int num) {
		this.num = num;
	}
 
	public int getNum() {
		return num;
	}

	@Override
	public void run() {
		
 
	
System.out.println("******Tabla del "+ this.getNum()+"********");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + i * num);
 
	}
 
	
}