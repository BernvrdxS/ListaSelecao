import java.util.Scanner;
import java.lang.Math;

public class Numero19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		float a = entrada.nextFloat();
		System.out.println("Digite o valor de b: ");
		float b = entrada.nextFloat();
		System.out.println("Digite o valor de c: ");
		float c = entrada.nextFloat();
		
		double delta = 0;
		double r1 = 0;
		double r2 = 0;
		delta = (((b*b)-(4*a*c)));
		
		if (delta < 0) {
			System.out.println("N�o � uma equa��o de segundo grau!");	
		}
		else {
			System.out.println("O delta tem valor de: "+delta);	
			
			if (delta == 0) {
				r1 = ((-b)+(Math.sqrt(delta)/2*a));
				System.out.println("A equa��o possui apenas a ra�z: "+r1);
			}
			else  {
				r1 = ((-b)+(Math.sqrt(delta)/(2*a)));
				r2 = ((-b)-(Math.sqrt(delta)/(2*a)));
				System.out.println("As duas ra�zes da equa��o s�o: "+r1  +r2);
		
				
				entrada.close();
			}
		}
	}

}
