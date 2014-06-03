package janela;

public class Formulario1 {

	public static void main(String[] args) {
		
		long tempo = System.currentTimeMillis();
		
		Processo proc1 = new Processo("abap");
		Processo proc2 = new Processo("sincoped");
		Processo proc3 = new Processo("valor de i");
		proc1.start();
		proc2.start();
		proc3.start();
		
		
		System.out.println("duração: " + (System.currentTimeMillis() - tempo));
		
	}
	
}
