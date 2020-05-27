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
		
		//LEITURA DO FINANCIAMENTO
				System.out.println("Numero de Pestaçoes: ");
				prestacoes=sc.nextDouble();
				System.out.println("Porcentagem de entrada: ");
				PorcentagemE=sc.nextDouble();
				System.out.println("Valor total do financiamente: ");
				ValorF=sc.nextDouble();
				
			double prestacao = ValorF *(100.0 - PorcentagemE)/100.0/prestacoes;
			
			while(prestacoes > 0.3 * salario) {
				System.out.print("Capacidade de pagamento excedida! Tente novamente: ");
				ValorF=sc.nextDouble();
				prestacao = ValorF *(100.0 - PorcentagemE)/100.0/prestacoes;
			}
				
			//PROCESSAMENTO FINANCIADO
			double entrada = ValorF * PorcentagemE /100.0;
			
			do {
				System.out.println("MENU:");
				System.out.println("1 - Mostrar valor da entrada");
				System.out.println("2 - Mostrar o valor financiado");
				System.out.println("3 - Mostrar valor de cada prestação");
				System.out.println("4 - Sair");
				System.out.println("Digite uma opcao: ");
				opcao=sc.nextInt();
				
				if(opcao==1) {
					System.out.printf("ENTRADA = R$ %.2f%n", entrada);
				}
				else if(opcao==2) {
					System.out.printf("VALOR FINANCIADO = R$%.2f%n", ValorF);
				}
				else if(opcao==3) {
					System.out.printf("VALOR DE CADA PRESTAÇÃO = R$%.2f%n", prestacao);
				}
				else if(opcao!=4) {
					System.out.println("OPÇÃO INVALIDA");
				}
				
				
			}while(opcao!=4) ; 
			System.out.println("FIM DO PROGRAMA!!");	
	
		sc.close();
	}

}
