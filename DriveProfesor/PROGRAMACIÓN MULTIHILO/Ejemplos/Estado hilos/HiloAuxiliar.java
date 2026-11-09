package paquetePrincipal;



class HiloAuxiliar extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ",");
            try {
                Thread.sleep(200); // 👈 añadimos un pequeño retardo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}