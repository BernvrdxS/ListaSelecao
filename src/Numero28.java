import java.util.Scanner;

public class Numero28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		double num = entrada.nextDouble();
		double arredondado =Math.round(num);
		
		if (num % 2 == 0) {
			System.out.println("Número par!");}
			else 
				System.out.println("Ímpar!");
		
		if (num == arredondado ) {
			System.out.println("Número inteiro!");}
			else 
				System.out.println("Número decimal!");
		
		if (num > 0) {
			System.out.println("Número positivo!");}
		if (num < 0) {
			System.out.println("Número negativo!");}
		if (num == 0) { 
				System.out.println("Zero!");}
		entrada.close();
	}

}
