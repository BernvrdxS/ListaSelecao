import java.util.Scanner;
import java.lang.Math;

public class Numero27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		double num = entrada.nextDouble();
		double arredondado =Math.round(num);

		if (num == arredondado ) {
			System.out.println("N�mero inteiro!");}
			else 
				System.out.println("N�mero decimal!");
		
		entrada.close();
		
	}

}
