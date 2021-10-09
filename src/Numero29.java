import java.util.Scanner;

public class Numero29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int class = 0;
		
		System.out.println("Responda essas perguntas com s(sim) ou n(não).");
		System.out.print("Telefonou para a vítima?");
		char r1 = entrada.next().charAt(0);
		
		System.out.print("Esteve no local do crime?");
		char r2 = entrada.next().charAt(0);
		
		System.out.print("Mora perto da vítima?");
		char r3 = entrada.next().charAt(0);
		
		System.out.print("Devia para a vítima?");
		char r4 = entrada.next().charAt(0);
		
		System.out.print("Já trabalhou com a vítima?");
		char r5 = entrada.next().charAt(0);
				
		if (r1 == 's') {
			class = class + 1}
		{else 
			class = class
		}
	}
}
