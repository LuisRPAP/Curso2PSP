package PiscinaHilosBiblioteca;

import java.util.ArrayList;

public class Hilo implements Runnable {
	ArrayList<String> biblioteca = new ArrayList<>();
	
	biblioteca.add("1. Don Quijote de la Mancha – Miguel de Cervantes");
	
	"2. La Celestina – Fernando de Rojas",
	"3. El Lazarillo de Tormes – Autor anónimo",
	"4. Fuenteovejuna – Lope de Vega",
	"5. La vida es sueño – Pedro Calderón de la Barca",
	"6. Don Juan Tenorio – José Zorrilla",
	"7. La Regenta – Leopoldo Alas «Clarín»",
	"8. Rimas y leyendas – Gustavo Adolfo Bécquer",
	"9. La casa de Bernarda Alba – Federico García Lorca",
	"10. Nada – Carmen Laforet"}

	int libro;
	String alumno;
	
	public Hilo(int libro, String alumno) {
		this.libro=libro;
		this.alumno=alumno;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void leer() {
		System.out.println();
		
	}
	
}
