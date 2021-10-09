import java.util.Scanner;

public class Numero22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número menor que 1000 para ser decomposto: ");
		int num = entrada.nextInt();
		
		int unidade = num % 10;
		num = (num - unidade) / 10;
		
		int dezena = num % 10;
		num = (num - dezena) / 10;
	
		int centena = num;
		centena = num;
		
		dezena = +dezena;
		centena = +centena;
		
		System.out.println(centena+ "centena(s), "  +dezena+ " dezena(s) e " +unidade+ " unidade(s)");
		entrada.close();
	}

}
