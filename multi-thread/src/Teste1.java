
public class Teste1 {

	public static void main(String[] args) {
		
		/*Runnable r = new Programa1();
		Thread t = new Thread(r);
		t.start();
		
		//utilizando classe anonima
		
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i = 0; i < 10000; i++) {
					System.out.println("programa 1 valor " + i);
				}
			}
		};
		
		
	*/	
		
		// Utiliando o Lambda sem metodo
		
		Runnable r = () -> {
			for (int  i = 0; i < 1000; i++) {
				System.out.println("Programa 1: " + i );
			}
		};
		Thread t = new Thread(r);
		t.start();
	
		// Compactando thread com lambda
		
		new Thread(() -> {
			for (int j = 0; j < 1000; j++) 
				System.out.println("Programa 2 valor " + j);
		}).start();
		
	}
}
	
