import java.util.Scanner;

public class Nota_Aprovação {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double p1,p2,media;
		
		System.out.println("Digite a sua nota:  ");
		p1 = sc.nextDouble();
		
		media = 5.00;
		p2 = 2 * media - p1;
		
		System.out.printf("O aluno precisa tirar %.2f para passar", p2);
		
		sc.close();
		
	}

}