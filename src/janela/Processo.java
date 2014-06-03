package janela;

public class Processo extends Thread{
   
	private String texto;
	
	public Processo(String texto) {
		this.texto = texto;
	}
	
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println(texto);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
