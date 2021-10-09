import java.util.Scanner;

public class Numero26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Número par!");}
			else 
				System.out.println("Ímpar!");
		entrada.close();
	}

}
