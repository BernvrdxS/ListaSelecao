import java.util.Scanner;

public class Numero13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor recebido por hora trabalhada: ");
		System.out.print("Informe a quantidade de horas trabalhadas no mes. ");
		int hora = entrada.nextInt();
		int quanthora = entrada.nextInt();
		
		double salariob = hora * quanthora;
		double inss = (salariob * 10) / 100;
		double ir = (salariob * 5) / 100;
		double fgts = (salariob * 11) / 100;
		double sind = (salariob * 3) / 100;
		double salario = 0;
		
		
		if (salariob <= 900) {
			System.out.println("Isento de imposto!");
		}
		else if ((salariob > 900) && (salariob <= 1500))
		{
		salario = salariob - ir - inss;
		}
		else if ((salariob > 1500) && (salariob <= 2500))
		{
		salario = salariob - ir - inss;

		}
		else 
		{
		 salario = salariob - ir - inss;
		}
		
	
		System.out.println("Seu sal�rio bruto �: "+salariob);
		System.out.println("O valor do seu FGTS �: "+fgts);
		System.out.println("O valor de INSS �: "+inss);
		System.out.println("O valor de imposto de renda �:" +ir);
		System.out.println("O valor que voc� paga ao sindicato �: "+sind);
		System.out.println("Seu sal�rio liqu�do �: "+salario);	  
		
		entrada.close();

	}
}



