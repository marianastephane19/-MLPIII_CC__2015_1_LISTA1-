
public class FitaInfantil extends Fita{

//	M�TODO QUE DESCONTA O PRE�O DA FITA DE INFANTIL EM 40%
	public FitaInfantil(String titulo, double preco) {
		super(titulo, preco - (preco * 0.40));
		
	}

}
