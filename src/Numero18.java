import java.util.Scanner;

public class Numero18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite tr�s valores: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("Os 3 lados formam um triangulo");	
		}
		if ((a == b) && (a == c)) {
			System.out.println("� um triangulo Equilatero");	
		}
		else 
			if ((a == b) || (a == c)  ||  (b == c))  {
			System.out.println("� um triangulo Isosceles");	
		}
			else 
				System.out.println("Escaleno");
		
		entrada.close();
	}

}
