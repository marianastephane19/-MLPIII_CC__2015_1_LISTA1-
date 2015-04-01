
public class FitaInfantil extends Fita{

//	MÉTODO QUE DESCONTA O PREÇO DA FITA DE INFANTIL EM 40%
	public FitaInfantil(String titulo, double preco) {
		super(titulo, preco - (preco * 0.40));
		
	}

}
