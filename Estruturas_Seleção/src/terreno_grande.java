import java.util.Scanner;
public class terreno_grande {

	public static void main(String[] args) {
	
		double area, base,altura;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		System.out.printf("O valor da area é %.2f \n" , area);
				
		if(area > 100) 
			System.out.println("Terreno é considerado Grande");
		else
			System.out.println("Terreno é considerado Pequeno");
		
		
		
		sc.close();
		
		
	}

}