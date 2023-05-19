import java.util.Scanner;
public class form_baskara {

	public static void main(String[] args) {
	
		double A,B,C,delta,r,r1,r2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		A = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		B = sc.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		C = sc.nextDouble();
		
	
		delta = Math.pow(B,2) - 4 * A * C;
		
		r = - B/(2*A);
		
		if (delta < 0)
			System.out.println("Nenhuma raiz");
		
		else if(delta == 0) 
			System.out.println("Duas raizes iguais %.2f% \n");
		
		else {
			r1 = (-B +Math.sqrt(delta)) / (2 * A);
			r2 = (-B -Math.sqrt(delta)) / (2 * A);
			System.out.printf("Raiz 1: %.2f e Raiz 2: %.2f", r1,r2);
		}
			
			
		sc.close();
		
	
	}

}