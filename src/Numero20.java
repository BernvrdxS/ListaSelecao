import java.util.Scanner;

public class Numero20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int ano;
		
		System.out.print("Informe um ano para saber se ele � bissexto: ");
		ano = entrada.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println(ano+ " � bissexto!");
		
		} else if (ano % 400 == 0) {
			System.out.println(ano+ " � bissexto!");
		} else {
			System.out.println(ano+ " n�o � bissexto!");
		}
		
		entrada.close();

	}

}
