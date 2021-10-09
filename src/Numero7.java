import java.util.Scanner;

public class Numero7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n1 = entrada.nextInt();
		
		System.out.print("Informe um número: ");
		int n2 = entrada.nextInt();
		
		System.out.print("Informe um número: ");
		int n3 = entrada.nextInt();
		
		if (n1 > n2 && n2 > n3) {
			System.out.println(+n1);
			System.out.println(+n2);
			System.out.println(+n3);
		
		}else if (n1 > n3 && n3 > n2) {
			System.out.println(+n1);
			System.out.println(+n3);
			System.out.println(+n2);
		
		}else if (n2 > n1 && n1 > n3) {
			System.out.println(+n2);
			System.out.println(+n1);
			System.out.println(+n3);
		
		}else if (n2 > n3 && n3 > n1) {
			System.out.println(+n2);
			System.out.println(+n3);
			System.out.println(+n1);
			
		}else if (n3 > n1 && n1 > n2) {
			System.out.println(+n3);
			System.out.println(+n1);
			System.out.println(+n2);
			
		}else if (n3 > n2 && n2 > n1) {
			System.out.println(+n3);
			System.out.println(+n2);
			System.out.println(+n1);
		
		}
		entrada.close();

	}
}
