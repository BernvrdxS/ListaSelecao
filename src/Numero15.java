import java.util.Scanner;

public class Numero15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o pre�o de custo do seu produto");
		float valor = entrada.nextFloat();
		System.out.print("Digite o n�mero correspondente a sua �rea");
		System.out.println("1- Sul");
		System.out.println("2- Norte");
		System.out.println("3- Leste");
		System.out.println("4- Oeste");
		System.out.println("5 ou 6- Nordeste");
		System.out.println("7 ou 8- Centro Oeste");
		int num = entrada.nextInt();
		
		switch (num) {

		case (1): 
		System.out.println("O valor do seu produto �:" +valor);
		System.out.println("Sua origem � do sul");
		break;
		case (2): 
		System.out.println("O valor do seu produto �:" +valor);
		System.out.println("Sua origem � do norte");
		break;
		case (3):
		System.out.println("O valor do seu produto �:" +valor);
		System.out.println("sua origem � do leste");
		break;
		case (4):
		System.out.println("O valor do seu produto �:" +valor);
		System.out.println("Sua origem � do oeste");
		break;
		case (5):
		System.out.println("O valor do seu produto �:" +valor);
		System.out.println("Sua origem � do nordeste");
		break;
		case (6):
		System.out.println("O valor do seu produto �:" +valor);
		System.out.println("Sua origem � do nordeste");
		break;
		case (7):
		System.out.println("O valor do seu produto �:" +valor);
		System.out.println("Sua origem � do centro oeste");
		break;
		case (8):
		System.out.println("O valor do seu produto �:" +valor);
		System.out.println("Sua origem � do centro oeste");
		break;
	
		default:   
			System.out.println("Importado");
		entrada.close();
	}
	
	}
}

