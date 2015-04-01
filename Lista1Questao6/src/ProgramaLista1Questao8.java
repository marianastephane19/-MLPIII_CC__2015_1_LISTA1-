import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProgramaLista1Questao8 {

	public static void main(String[] args) throws Exception {
		Fita fita;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("                     LOCADORA DE FITAS\n"
				+ "                     CADASTRO DE PRE�OS");
		System.out.println("1. Lan�amentos\n2. Infantis");
		System.out.println("\nInforme o g�nero que deseja cadastrar.");
		int opcao = Integer.parseInt(buffer.readLine());
		
//		ENTRADA DO T�TULO DO FILME
		System.out.println("Informe o t�tulo do filme:");
		String titulo = buffer.readLine();

//		ENTRADA DO PRE�O DO FILME
		System.out.println("Informe o pre�o do filme:");
		double preco = Double.parseDouble(buffer.readLine());

		switch (opcao) {
		case 1: {
			fita = new FitaLancamento(titulo, preco);
			
//			SA�DA COM AS IMPRESS�ES DO: T�TULO, PRE�O ORIGINAL E PRE�O REAJUSTADO
			System.out.println("\nT�tulo do filme.: " + fita.getTitulo()
					+ "\nValor informado.: R$ " + String.format("%.2f", preco)
					+ "\nPre�o reajustado: R$ " + String.format("%.2f",  fita.getPreco()));
			break;
		}
		case 2: {
			fita = new FitaInfantil(titulo, preco);
			
//			SA�DA COM AS IMPRESS�ES DO: T�TULO, PRE�O ORIGINAL E PRE�O DESCONTADO
			System.out.println("\nT�tulo do filme.: " + fita.getTitulo()
					+ "\nValor informado.: R$ " + String.format("%.2f", preco)
					+ "\nPre�o descontato: R$ " + String.format("%.2f", fita.getPreco()));
			break;
		}
		default:
		}

	}
}
