import java.util.Scanner;
import java.lang.Math;

public class Numero28v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		double num = entrada.nextDouble();
		double arredondado = Math.round(num);
		
		if (num % 2 == 0) {
			System.out.println("N�mero par!");}
			else 
				System.out.println("�mpar!");
		
		if (num == arredondado) {
			System.out.println("N�mero inteiro!");}
			else 
				System.out.println("N�mero decimal!");
		if (num > 0)
			System.out.println("Positivo!");
		if (num < 0)
			System.out.println("Negativo!");
		if (num == 0)
			System.out.println("Zero!");
		
		entrada.close();
	}

}
