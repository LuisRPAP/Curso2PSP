package EjerciciosPSP;

public static void EjercicioMultiplicar(String[] args) {
	for(int i=0;i<10;i++) {
		EjercicioMultiplicar t = new EjercicioMultiplicar(i);
		t.start();
		try {
		t.join();
	}catch(InterruptedException e) {
		e.printstackTrace();
	}

}
	}
