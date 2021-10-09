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
			System.out.println("Não é uma equação de segundo grau!");	
		}
		else {
			System.out.println("O delta tem valor de: "+delta);	
			
			if (delta == 0) {
				r1 = ((-b)+(Math.sqrt(delta)/2*a));
				System.out.println("A equação possui apenas a raíz: "+r1);
			}
			else  {
				r1 = ((-b)+(Math.sqrt(delta)/(2*a)));
				r2 = ((-b)-(Math.sqrt(delta)/(2*a)));
				System.out.println("As duas raízes da equação são: "+r1  +r2);
		
				
				entrada.close();
			}
		}
	}

}
