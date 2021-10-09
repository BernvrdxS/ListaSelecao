import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Informe um número: ");
	    int num = entrada.nextInt();
	    
	    if (num > 0)
	    	System.out.println("Positivo!");
	    if (num == 0)
	    	System.out.println("Zero!");
	    if (num < 0)
	    	System.out.println("Negativo!");
	    
	    entrada.close();
	}

}
