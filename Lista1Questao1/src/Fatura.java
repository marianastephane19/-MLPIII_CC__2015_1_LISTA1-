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
	
//	ESTE MÉTODO ESTÁ DIREFERENTE DO PADRÃO CRIADO AUTOMATICAMENTE
//	PELO JAVA, POIS, A QUESTÃO PEDE PARA QUE OS PREÇOS DIGITADOS
//	COM VALOR NEGATIVO TENHA A FORMATAÇÃO DE IMPRESSÃO "0.0"
	public double getPreco() {
		return preco < 0 ? 0.0 : preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
//	MÉTODO PARA CALCULAR VALOR TOTAL DA FATURA.
	public double getValorFatura(){
		double preco = getPreco();
		int qtd = getQtdItem();
		double valorFatura = qtd * preco;
		return valorFatura > 0 ? valorFatura : 0;
	}

}
