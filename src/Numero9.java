import java.util.Scanner;

public class Numero9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu sexo - F(feminino), M(masculino):");
		String sexo = entrada.next(); 
		
		if ("F".equals(sexo)){
			System.out.println("Feminino!");
				System.out.print("Informe sua altura: ");
					float altura = entrada.nextFloat();
						System.out.print("Informe seu peso: ");
							float peso = entrada.nextFloat();
								double pesoideal = (62.1*altura)-44.7;
									System.out.println("Sua altura é: "+altura);
										System.out.println("Seu peso é: "+peso);
											System.out.println("Seu peso ideal é:" +pesoideal);
											if (peso <= pesoideal);{
												System.out.println("Você está abaixo do peso ideal");
											} if (peso >= pesoideal)
												System.out.println("Você está acima do peso ideal");
											
			
		}else if("M".equals(sexo)){
			System.out.println("Masculino!");
				System.out.print("Informe sua altura: ");
					float altura = entrada.nextFloat();
						System.out.print("Informe seu peso: ");
							float peso = entrada.nextFloat();
								double pesoideal = (72.7*altura)-58;
									System.out.println("Sua altura é: "+altura);
										System.out.println("Seu peso é: "+peso);
											System.out.println("Seu peso ideal é:" +pesoideal);
												if (peso <= pesoideal);{
													System.out.println("Você está abaixo do peso ideal");
												if (peso >= pesoideal);
													System.out.println("Você está acima do peso ideal");
		}	
		entrada.close();
	}
		
		
		
}
}
