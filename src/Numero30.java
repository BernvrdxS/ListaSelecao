import java.util.Scanner;

public class Numero30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escolha um tipo de combustível: ");
		System.out.print("A(alcool)");
		System.out.print("B(gasolina");
		char escolha = entrada.next().charAt(0);
	

		double valorfinal = 0;
		
		System.out.print("Informe o valor de litros: ");
		double litros = entrada.nextDouble();
		
		if ((litros <= 20) && (escolha == 'a')) {
			valorfinal = (litros*1.90);
			System.out.println("Valor final sem descontos: "+valorfinal);
			valorfinal = valorfinal - (valorfinal * 0.03);
			System.out.println("Valor final com descontos: "+valorfinal);}
		
		else if ((litros > 20) && (escolha == 'a')) {
			valorfinal = (litros*1.90);
			System.out.println("Valor final sem descontos: "+valorfinal);
			valorfinal = valorfinal - (valorfinal * 0.05);
			System.out.println("Valor final com descontos: "+valorfinal);}
		{
			if ((litros <= 20) && (escolha == 'g')) {
				valorfinal = (litros*2.50);
				System.out.println("Valor final sem descontos: "+valorfinal);
				valorfinal = valorfinal - (valorfinal * 0.04);
				System.out.println("Valor final com descontos: "+valorfinal);}
	
			else if ((litros > 20) && (escolha == 'g')) {
				valorfinal = (litros*2.50);
				System.out.println("Valor final sem descontos: "+valorfinal);
				valorfinal = valorfinal - (valorfinal * 0.06);
				System.out.println("Valor final com descontos: "+valorfinal);}
			
			entrada.close();
	}
	}
}

