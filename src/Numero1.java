import java.util.Scanner;
public class Numero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    
	     System.out.print("Informe dois números: ");
	     int num1 = entrada.nextInt();
	     int num2 = entrada.nextInt();
	     
	     if (num1 > num2)
	    	 System.out.println("O maior número informado foi: "+num1);
	     
	     if (num2 > num1)
	    	 System.out.println("O maior número informado foi: "+num2);
	     
	     entrada.close();

	}

}
