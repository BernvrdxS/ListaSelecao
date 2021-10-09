import java.util.Scanner;

public class Numero24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe sua 1a nota: ");
		double n1 = entrada.nextDouble();
		System.out.print("Informe sua 2a nota: ");
		double n2 = entrada.nextDouble();
		System.out.println("Informe sua 3a nota: ");
		double n3 = entrada.nextDouble();
		double media = ((n1+n2+n3) / 3);
		
		if (media == 10) {
			System.out.println("Sua média é: "+media);	
			System.out.println("Aprovado com distinção!");
		}
		else if (media >= 7) {
			System.out.println("Sua média é: "+media);	
			System.out.println("Aprovado!");
		}
		else if (media < 7){
			System.out.println("Sua média é: "+media);	
			System.out.println("Reprovado!");
		}

	entrada.close();
		
	}

}
