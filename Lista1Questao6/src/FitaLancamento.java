
public class FitaLancamento extends Fita {

	
//	M�TODO QUE REAJUSTA O PRE�O DA FITA DE LAN�AMENTO EM 20%
	public FitaLancamento(String titulo, double preco) {
		super(titulo, preco + (preco * 0.20));
		
	}
	
}
