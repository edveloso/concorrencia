package janela;

public class Processo extends Thread {

	private String texto;
	
	public Processo(String texto) {
	   this.texto = texto;
	}
	
	public void run(){

		for (int i = 0; i < 5; i++) {
			System.out.println(this.texto);
			try{
				Thread.sleep(1);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	
}
