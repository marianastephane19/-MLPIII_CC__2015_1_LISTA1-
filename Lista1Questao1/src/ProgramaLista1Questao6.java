import java.util.Scanner;

public class ProgramaLista1Questao6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String numero;
		String descricao;
		int qtd;
		Double preco;

		System.out.println("Informe os dados da fatura\n\n");
		
//		ENTRADA DOS DADOS DO PRODUTO
		System.out.println("Informe o n� do produto");
		numero = s.next();
		System.out.println("Informe o nome do produto");
		descricao = s.next();
		System.out.println("Informe quantidade do produto");
		qtd = s.nextInt();
		System.out.println("Informe o pre�o do produto");
		preco = s.nextDouble();

//		INSTANCIA��O DOS VALORES OBTIDOS ACIMA, PARA O CONSTRUTOR DE FATURA
		Fatura fatura = new Fatura(numero, descricao, qtd, preco);

//		IMPRESS�O DOS C�LCULOS E DADOS DOS PRODUTOS CAPTURADOS 
		System.out.println("                       FATURA DATALHADA\n\n");
		System.out
				.println("C�DIGO         DESCRI��O                       QUANT.    VALOR UNI.    VALOR TOTAL");
		System.out.println("  " + fatura.getNumero() + "            "
				+ fatura.getDescricao() + "                           "
				+ fatura.getQtdItem() + "          " + fatura.getPreco() + "    "
						+ "        "
				+    fatura.getValorFatura());

	}

}
