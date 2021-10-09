import java.util.Scanner;

public class Numero6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
			int num2 = (num + 1);
			System.out.println("O número par informado foi : " +num2);		
		}
		if (num % 2 != 0) {
			int num2 = (num + 1);
			System.out.println("O número ímpar informado foi : " +num2);		

		}
		entrada.close();
	}

}
