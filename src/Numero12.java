import java.util.Scanner;

public class Numero12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu sal�rio: ");
		float salario = entrada.nextFloat();
		 
		double pequeno = salario*1.20;
		double medio = salario*1.15;
		double alto = salario*1.10;
		double grande = salario*1.05;
		
		System.out.println("Seu sal�rio antes do reajuste �: "+salario);
		
	if (salario <= 280) {
			System.out.println("Seu sal�rio aumentou 20%, agora �: "+pequeno);
		}
	if ((salario > 280) && (salario <= 700));
			System.out.println("Seu sal�rio aumentou 15%, agora �: "+medio);
			{
				{
	}if ((salario > 700) && (salario <= 1500))
			System.out.println("Seu sal�rio aumentou 10%, agora �: "+alto);
	{
	}if  (salario > 1500);
			System.out.println("Seu sal�rio aumentou 5%, agora �:" +grande);
				
			
			entrada.close();
			}
			
	}
}
	
			




