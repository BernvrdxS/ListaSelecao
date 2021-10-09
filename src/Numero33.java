import java.util.Scanner;

public class Numero33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe suas respostas: ");
		char r1 = entrada.next().charAt(0);
		char r2 = entrada.next().charAt(0);
		char r3 = entrada.next().charAt(0);
		char r4 = entrada.next().charAt(0);
		char r5 = entrada.next().charAt(0);
		char r6 = entrada.next().charAt(0);
		char r7 = entrada.next().charAt(0);
		char r8 = entrada.next().charAt(0);
		char r9 = entrada.next().charAt(0);
		char r10 = entrada.next().charAt(0);

		if (r1 == 'a') {
			System.out.println("Correto!");
		}
		if (r2 != 'a') {
			System.out.println("Errado, resposta correta: (a)");
		}
		if (r3 == 'b') {
			System.out.println("Correto!");
		}
		if (r4 != 'b') {
			System.out.println("Errado, resposta correta: (b)");
		}
		if (r5 != 'c') {
			System.out.println("Errado, resposta correta: (c)");
		}
		if (r6 == 'c') {
			System.out.println("Correto!");
		}
		if (r7 != 'd') {
			System.out.println("Errado, resposta correta: (d)");
		}
		if (r8 == 'd') {
			System.out.println("Correto!");
		}
		if (r9 != 'e') {
			System.out.println("Errado, resposta correta: (e)");
		}
		if (r10 == 'e') {
			System.out.println("Correto!");
		}
		
		entrada.close();
	}

}
