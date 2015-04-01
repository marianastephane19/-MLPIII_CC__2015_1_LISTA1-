
public class FitaLancamento extends Fita {

	
//	MÉTODO QUE REAJUSTA O PREÇO DA FITA DE LANÇAMENTO EM 20%
	public FitaLancamento(String titulo, double preco) {
		super(titulo, preco + (preco * 0.20));
		
	}
	
}
