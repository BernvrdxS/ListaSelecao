import java.util.Scanner;

public class Numero16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua 1a nota:");
		float nota1 = entrada.nextFloat();
		System.out.print("Informe sua 2a nota: ");
		float nota2 = entrada.nextFloat();
		
		float media = ((nota1 + nota2)/2);
		
		
		if (media >= 7) {
			System.out.println("Aprovado!");
		}else if ((media > 3) || (media < 7)) {

			System.out.println("Em exame!");
		}
		else {
			System.out.println("Reprovado!");
		entrada.close();
		}

}
}
	 
		


