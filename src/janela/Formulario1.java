package janela;

public class Formulario1 {

	public static void main(String[] args) {
		
		long tempo = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			System.out.println("abap");
		}
		
		
		for (int i = 0; i < 1000000; i++) {
			System.out.println("sincoped");
		}
		
		for (int i = 0; i < 1000000; i++) {
			System.out.println("valor de i: " + i);
		}
		
		
		System.out.println("duração: " + (System.currentTimeMillis() - tempo));
		
		
		
	}
	
}
