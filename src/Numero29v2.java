import java.util.Scanner;

public class Numero29v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int classif = 0;
		
		System.out.print("Responda essas perguntas com s(sim) ou n(n�o).");
		
		System.out.print("Telefonou para a v�tima?");
		char r1 = entrada.next().charAt(0);
		
		System.out.print("Esteve no local do crime?");
		char r2 = entrada.next().charAt(0);
		
		System.out.print("Mora perto da v�tima?");
		char r3 = entrada.next().charAt(0);
		
		System.out.print("Devia para a v�tima?");
		char r4 = entrada.next().charAt(0);
		
		System.out.print("J� trabalhou com a v�tima?");
		char r5 = entrada.next().charAt(0);
		
		if (r1 == 's') {
			classif = classif + 1;
		}
		if (r2 == 's') {
			classif = classif + 1;
		}
		if (r3 == 's') {
			classif = classif + 1;
		}
		if (r4 == 's') {
			classif = classif + 1;
		}
		if (r5 == 's') {
			classif = classif + 1;
		}
		if (classif == 2) {
			System.out.println("Suspeito!");}
		else if ((classif > 3) && (classif < 4)) {
			System.out.println("Cumplice!");
		}
		else if (classif == 5) {
			System.out.println("Assassino!");
	
		
		entrada.close();
			
		}
	}
}


