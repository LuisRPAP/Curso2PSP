package EjerciciosPSP;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     if (args.length == 0) {
	            System.out.println("No se han pasado argumentos al programa.");
	            System.out.println("Uso: java CapturaArgumentos <nombre_proceso> <tiempo_segundos>");
	            return; 
	        }

	        String procesoAEditar = args[0];
	        int argumento=0;
	        try {
	        	argumento= Integer.parseInt(procesoAEditar);
	        }
	        catch(Exception e) {
	        	System.out.println("Por favor introduzca un numero entero");
	        }
	        System.out.println("El argumento recibido es: " + argumento);

	      for(int i;i==argumento;i++) {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
	      }
	      
        Process proceso = null;
        
        
        try {
            proceso = pb.start();
            System.out.println("Proceso 1 Creado con exito.");
            
            
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
