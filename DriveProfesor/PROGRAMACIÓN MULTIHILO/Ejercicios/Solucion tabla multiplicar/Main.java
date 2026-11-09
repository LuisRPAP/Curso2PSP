package tablaMultiplicar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Tabla mt1 = new Tabla(1);
		Tabla mt2 = new Tabla(2);
		Tabla mt3 = new Tabla(3);
		Tabla mt4 = new Tabla(4);

for (int i = 0; i<10;i++){
Tabla t = new Tabla(i);
t.start();
t.join();
}

		
}