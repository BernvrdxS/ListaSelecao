import java.util.Scanner;

public class Numero5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe uma letra para saber se ela � vogal: ");
		char vogal = entrada.next().charAt(0);
		
		switch (vogal) {
		
		case 'a':
			System.out.println("� uma vogal!");
			
		case 'e':
			System.out.println("� uma vogal!");
			
		case 'i':
			System.out.println("� uma vogal!");
		
		case 'o':
			System.out.println("� uma vogal!");
			
		case 'u':
			System.out.println("� uma vogal!");
		
			default:
				System.out.println("N�o � uma vogal!!!");
			
		}
		
	
		
		
		entrada.close();
		
	}

}
