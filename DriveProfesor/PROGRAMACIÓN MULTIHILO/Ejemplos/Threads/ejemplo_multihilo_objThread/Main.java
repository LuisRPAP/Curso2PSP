package ejemplo_multihilo_objThread;

public class Main {

	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("+");
				}
			}
		}.start();;
		new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("-");
				}
			}
		}.start();;
		new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("$");
				}
			}
		}.start();

	}

}
