import java.util.Scanner;

public class ProgramaLista1Questão5 {
	public static void main(String[] args) {
		String scannerEntrada;

		Scanner s = new Scanner(System.in);
		
//		LEITURA DA ENTRADA DE CARACTERES.
		System.out.println("Informe os dados do salário.");
		scannerEntrada = s.nextLine();

//		INSTANCIAÇÃO DOS CARACTERES LIDOS.
		LeitorDeDados leitor = new LeitorDeDados(scannerEntrada);

//		IMPRESSÃO DO SALÁRIO.
		System.out
				.println("A sequência informada corresponde ao salário no valor de R$ "
						+ leitor.retornaSalario()+".");

	}
}
