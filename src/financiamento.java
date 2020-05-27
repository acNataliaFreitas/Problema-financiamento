import java.util.Locale;
import java.util.Scanner;

public class financiamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario,PorcentagemE, ValorF,prestacoes;
		int opcao;
		
	//LEITURA DO NOME E SALARIO
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do cliente: ");
		nome=sc.nextLine();
		System.out.println("Salario: ");
		salario=sc.nextDouble();
		
		while(salario < 0.0) {
			System.out.println("VALOR INVALIDO, POR FAVOR DIGITE NOVAMENTE!!");
			salario=sc.nextDouble();
		}
		
	
		sc.close();
	}

}
