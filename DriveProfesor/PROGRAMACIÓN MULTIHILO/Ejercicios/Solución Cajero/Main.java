
public class Main extends Thread{

	public static void main(String[] args) {
		Cuenta c = new Cuenta ("bankinter",30);
		Persona p1 = new Persona("eduardo",c);
		Persona p2 = new Persona("juan",c);
		Persona p3 = new Persona("María",c);
		Persona p4 = new Persona("Luisa",c);

		new Thread() {
            @Override public void run() {
            	
            	try {
				p1.sacarDinero(60);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} ; }
        }.start();
        
        new Thread() {
            @Override public void run() {
            
            	p2.consultarSaldo();  }
        }.start();
        
        new Thread() {
            @Override public void run() {
            	
            	p4.ingresarDinero(80);  }
        }.start();
        
        new Thread() {
            @Override public void run() {
            	
            	try {
				p3.sacarDinero(20);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} ; }
        }.start();
        new Thread() {
            @Override public void run() {
            	
            	
				try {
					p4.sacarDinero(20);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
			  }
        }.start();
        
        new Thread() {
            @Override public void run() {
            	
            	
				p1.ingresarDinero(30);
			
			  }
        }.start();
        new Thread() {
            @Override public void run() {
            
            	p2.consultarSaldo();  }
        }.start();
	}
	

}
