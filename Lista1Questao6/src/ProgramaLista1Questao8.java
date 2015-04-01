import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProgramaLista1Questao8 {

	public static void main(String[] args) throws Exception {
		Fita fita;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("                     LOCADORA DE FITAS\n"
				+ "                     CADASTRO DE PREÇOS");
		System.out.println("1. Lançamentos\n2. Infantis");
		System.out.println("\nInforme o gênero que deseja cadastrar.");
		int opcao = Integer.parseInt(buffer.readLine());
		
//		ENTRADA DO TÍTULO DO FILME
		System.out.println("Informe o título do filme:");
		String titulo = buffer.readLine();

//		ENTRADA DO PREÇO DO FILME
		System.out.println("Informe o preço do filme:");
		double preco = Double.parseDouble(buffer.readLine());

		switch (opcao) {
		case 1: {
			fita = new FitaLancamento(titulo, preco);
			
//			SAÍDA COM AS IMPRESSÕES DO: TÍTULO, PREÇO ORIGINAL E PREÇO REAJUSTADO
			System.out.println("\nTítulo do filme.: " + fita.getTitulo()
					+ "\nValor informado.: R$ " + String.format("%.2f", preco)
					+ "\nPreço reajustado: R$ " + String.format("%.2f",  fita.getPreco()));
			break;
		}
		case 2: {
			fita = new FitaInfantil(titulo, preco);
			
//			SAÍDA COM AS IMPRESSÕES DO: TÍTULO, PREÇO ORIGINAL E PREÇO DESCONTADO
			System.out.println("\nTítulo do filme.: " + fita.getTitulo()
					+ "\nValor informado.: R$ " + String.format("%.2f", preco)
					+ "\nPreço descontato: R$ " + String.format("%.2f", fita.getPreco()));
			break;
		}
		default:
		}

	}
}
