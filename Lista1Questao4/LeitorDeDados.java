
public class LeitorDeDados {
	private String capturarDados;

	public LeitorDeDados(String capturarDados) {
		super();
		this.capturarDados = capturarDados;
	}
	
	
//	 M�TODO PARA CALCULAR APENAS OS N�MEROS DOS CARACTERES QUE FORAM LIDOS 
//	 NA CLASSE PROGRAMA E RETORNAR O VALOR SAL�RIO.
	public int retornaSalario() {
		
		int salario = 0;
		
		String [] dados = capturarDados.split("[a-zA-Z\\W]");
		
		for (String string : dados) {
			if (string.length() > 0)
				salario += Integer.parseInt(string);
		}
		
		return salario;
	}
}
