import java.util.Scanner;

public class Numero17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe sua 1a nota: ");
		double n1 = entrada.nextDouble();
		System.out.print("Informe sua 2a nota: ");
		double n2 = entrada.nextDouble();
		double media = ((n1+n2) / 2);
		
		if ((media >= 9) && (media <= 10)) {
			System.out.println("Sua m�dia �: "+media);	
			System.out.println("Seu conceito � A!");
			System.out.println("Aprovado!");
		}
		else if ((media >= 7.5) && (media <= 9)) {
			System.out.println("Sua m�dia �: "+media);	
			System.out.println("Seu conceito � B!");
			System.out.println("Aprovado!");
		}
		else if ((media >= 6) && (media <= 7.5)) {
			System.out.println("Sua m�dia �: "+media);	
			System.out.println("Seu conceito � C!");
			System.out.println("Aprovado!");
		}
		else if ((media >= 4) && (media <= 6)) {
			System.out.println("Sua m�dia �: "+media);	
			System.out.println("Seu conceito � D!");
			System.out.println("Reprovado!");
			}
		else if ((media >= 0) && (media <= 4)) 
			System.out.println("Sua m�dia �: "+media);	
			System.out.println("Seu conceito � E!");
			System.out.println("Reprovado!");

	entrada.close();
	}




}



