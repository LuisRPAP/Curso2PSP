package EjerciciosPSP;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		      
		        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
		        
		        Process proceso = null;
		        
		        try {
		            proceso = pb.start();
		            System.out.println("Bloc de notas iniciado con éxito.");
		            
		            
		            String nombreProceso = "notepad.exe"; 
		            Date date=null;
		            
		            while (proceso.isAlive() ) {
		            
		                date = new Date();
		                System.out.println(date + " - El proceso " + nombreProceso + " sigue vivo");

		                proceso.waitFor(5, TimeUnit.SECONDS);
		            

		                
		            }

		            
		            System.out.println("El proceso ha terminado.");

		        } catch (IOException e) {
		            System.err.println("Error al intentar iniciar el Bloc de notas: " + e.getMessage());
		        } catch (InterruptedException e) {
		            System.err.println("El proceso principal fue interrumpido: " + e.getMessage());
		            Thread.currentThread().interrupt();
		        }
		 


	}

}
