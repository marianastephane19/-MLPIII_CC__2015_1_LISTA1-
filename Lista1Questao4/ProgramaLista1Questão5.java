import java.util.Scanner;

public class ProgramaLista1Quest�o5 {
	public static void main(String[] args) {
		String scannerEntrada;

		Scanner s = new Scanner(System.in);
		
//		LEITURA DA ENTRADA DE CARACTERES.
		System.out.println("Informe os dados do sal�rio.");
		scannerEntrada = s.nextLine();

//		INSTANCIA��O DOS CARACTERES LIDOS.
		LeitorDeDados leitor = new LeitorDeDados(scannerEntrada);

//		IMPRESS�O DO SAL�RIO.
		System.out
				.println("A sequ�ncia informada corresponde ao sal�rio no valor de R$ "
						+ leitor.retornaSalario()+".");

	}
}
