package EjerciciosPSP;

public class Ejercicio4Hilos {

    public static void main(String[] args) {
        // 1. Crear las instancias de las clases que implementan Runnable
        Numero tarea1 = new Numero();
        Palabra tarea2 = new Palabra();
        
        // 2. Asociarlas a un objeto de tipo Thread
        Thread hilo1 = new Thread(tarea1);
        Thread hilo2 = new Thread(tarea2);
        
        // 3. Ejecutar los hilos con start()
        hilo1.start();
        hilo2.start();
    }
}

// Clase externa que implementa Runnable para los números
class Numero implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}

// Clase externa que implementa Runnable para las letras
class Palabra implements Runnable {
    @Override
    public void run() {
        String[] letra = {"a","b","c","d","e","f","g","h","i","j"};
        for (int i = 0; i < 10; i++) {
            System.out.print(letra[i]);
        }
    }
}

