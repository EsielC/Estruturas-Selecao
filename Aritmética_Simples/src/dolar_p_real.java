import java.util.Scanner;

public class dolar_p_real {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double cd,qd,r;
		
		System.out.println("Digite a cotação do Dólar: ");
		cd = sc.nextDouble();
		
		System.out.println("Digite a quantidade de Dólares: ");
		qd = sc.nextDouble();
		
		r = qd/cd;
		
		System.out.printf("O valor de Dólares convertidos é R$: %.2f", r);
		
		sc.close();
		
	}

}