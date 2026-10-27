	package EjerciciosPSP;
	
	//EJERCICIO HECHO POR LA IA, Y EXPLICADO POR ELLA
	
	
	
	

	// Objeto compartido que indica el estado del archivo
	class ArchivoCompartido {
	    private boolean disponible = false;

	    // Método que usa el Procesador para intentar acceder al archivo
	    public synchronized void esperarArchivo() {
	        while (!disponible) {
	            try {
	                System.out.println("[Procesador] Archivo NO disponible. Esperando...");
	                wait(); // El procesador se duerme hasta recibir la señal
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("[Procesador] ¡Archivo disponible! Comenzando el procesamiento...");
	    }

	    // Método que usa el Descargador para finalizar la descarga
	    public synchronized void finalizarDescarga() {
	        System.out.println("[Descargador] Descarga finalizada. Despertando al procesador...");
	        disponible = true;
	        notify(); // Despierta al hilo procesador que estaba esperando
	    }
	}

	// Hilo encargado de la descarga
	class Descargador implements Runnable {
	    private ArchivoCompartido archivo;

	    public Descargador(ArchivoCompartido archivo) {
	        this.archivo = archivo;
	    }

	    @Override
	    public void run() {
	        System.out.println("[Descargador] Iniciando descarga del archivo...");
	        try {
	            // Simulamos el tiempo que tarda en descargarse (3 segundos)
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        archivo.finalizarDescarga();
	    }
	}

	// Hilo encargado del procesamiento
	class Procesador implements Runnable {
	    private ArchivoCompartido archivo;

	    public Procesador(ArchivoCompartido archivo) {
	        this.archivo = archivo;
	    }

	    @Override
	    public void run() {
	        // Intenta acceder de inmediato (antes de que termine la descarga)
	        archivo.esperarArchivo();
	    }
	}

	// Clase principal que ejecuta el ejercicio
	public class Ejercicio9Hilos {
	    public static void main(String[] args) {
	        // 1. Crear el objeto compartido
	        ArchivoCompartido archivo = new ArchivoCompartido();

	        // 2. Crear las tareas (Runnable) pasándoles el objeto compartido
	        Descargador tareaDescarga = new Descargador(archivo);
	        Procesador tareaProcesar = new Procesador(archivo);

	        // 3. Crear y asociar los hilos
	        Thread hiloDescargador = new Thread(tareaDescarga);
	        Thread hiloProcesador = new Thread(tareaProcesar);

	        // 4. Iniciar ambos hilos
	        hiloProcesador.start(); // El procesador intentará acceder primero y se quedará esperando
	        hiloDescargador.start(); // El descargador inicia su proceso
	    }
	}



