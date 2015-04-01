public class Fatura {
	private String numero;
	private String descricao;
	private int qtdItem;
	private double preco;

	public Fatura(String numero, String descricao, int qtdItem, double preco) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.qtdItem = qtdItem;
		this.preco = preco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdItem() {
		return qtdItem;
	}

	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}
	
//	ESTE M�TODO EST� DIREFERENTE DO PADR�O CRIADO AUTOMATICAMENTE
//	PELO JAVA, POIS, A QUEST�O PEDE PARA QUE OS PRE�OS DIGITADOS
//	COM VALOR NEGATIVO TENHA A FORMATA��O DE IMPRESS�O "0.0"
	public double getPreco() {
		return preco < 0 ? 0.0 : preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
//	M�TODO PARA CALCULAR VALOR TOTAL DA FATURA.
	public double getValorFatura(){
		double preco = getPreco();
		int qtd = getQtdItem();
		double valorFatura = qtd * preco;
		return valorFatura > 0 ? valorFatura : 0;
	}

}
