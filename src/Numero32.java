import java.util.Scanner;

public class Numero32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Para escolher entre 1(file), 2(alcatra) e 3(picanha) escolha: ");
		int escolha = entrada.nextInt();
		System.out.print("Pagamento no cartão Tabajara? s(sim) ou n(não)? ");
		char cartao = entrada.next().charAt(0);
		System.out.print("Quantos kg da carne selecionada você quer? ");
		double kg = entrada.nextDouble();
		
		double precototal = 0;
		
		if ((kg <= 5) && (escolha == 1)) {
			precototal = (kg*4.90);
			System.out.println("Valor final: "+precototal);}

		else if ((kg > 5) && (escolha == 1)) {
			precototal = (kg*5.80);
			System.out.println("Valor final: "+precototal);

	}
		if ((kg <= 5) && (escolha == 2)) {
			precototal = (kg*5.90);
			System.out.println("Valor final: "+precototal);}

		else if ((kg > 5) && (escolha == 2)) {
			precototal = (kg*6.80);
			System.out.println("Valor final: "+precototal);
}

		if ((kg <= 5) && (escolha == 3)) {
			precototal = (kg*6.90);
			System.out.println("Valor final: "+precototal);}

		else if ((kg > 5) && (escolha == 3)) {
			precototal = (kg*7.80);
			System.out.println("Valor final: "+precototal);
}
		if (cartao == 's'){
			precototal = precototal - (precototal * 0.05);
			System.out.println("O valor final com desconto é: "+precototal);
			
			entrada.close();
			
		}

	}

}
