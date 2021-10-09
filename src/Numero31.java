import java.util.Scanner;

public class Numero31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Para escolher entre 1(morango) e 2(maçã) escolha: ");
		int escolha = entrada.nextInt();
		
		System.out.print("Quantos kg da fruta selecionada você quer? ");
		double kg = entrada.nextDouble();
		
		double precototal = 0;
		
		if ((kg <= 5) && (escolha == 1)) {
			precototal = (kg*2.50);
			System.out.println("Valor final: "+precototal);}

		else if ((kg > 5) && (escolha == 1)) {
			precototal = (kg*2.20);
			System.out.println("Valor final: "+precototal);

	}
		if ((kg <= 5) && (escolha == 2)) {
			precototal = (kg*1.80);
			System.out.println("Valor final: "+precototal);}

		else if ((kg > 5) && (escolha == 1)) {
			precototal = (kg*1.50);
			System.out.println("Valor final: "+precototal);
}
		if (kg > 8 || precototal >25){
			precototal = precototal - (precototal * 0.10);
			System.out.println("O valor final com desconto é: "+precototal);
		}
		entrada.close();
}
}