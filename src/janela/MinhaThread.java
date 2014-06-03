package janela;

public class MinhaThread extends Thread {

	private int inicio;
	private int fim;

	public MinhaThread(int inicio, int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}

	public void run() {
		for (int i = inicio; i < fim; i++) {
			System.out.println("valor de i: " + i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
