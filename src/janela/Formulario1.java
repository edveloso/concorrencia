package janela;

public class Formulario1 {

	public static void main(String[] args) throws InterruptedException {
		
		long tempo = System.currentTimeMillis();
		Processo proc1 = new Processo("sinc");
		Processo proc2 = new Processo("abap");
		Processo proc3 = new Processo("numero");
		proc1.start();
		proc2.start();
		proc3.start();
		
		
		System.out.println("duração: " + (System.currentTimeMillis() - tempo));
		
		
		
	}
	
}
