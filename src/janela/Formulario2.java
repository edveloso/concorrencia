package janela;

public class Formulario2 {

	public static void main(String[] args) {
		
		MinhaThread mt1 = new MinhaThread(0, 249);
		MinhaThread mt2 = new MinhaThread(250, 499);
		MinhaThread mt3 = new MinhaThread(500, 749);
		MinhaThread mt4 = new MinhaThread(750, 999);
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		
	}
	
}
