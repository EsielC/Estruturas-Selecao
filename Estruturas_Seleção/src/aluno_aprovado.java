import java.util.Scanner;
public class aluno_aprovado {

	public static void main(String[] args) {
	
		double n1, n2, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1= sc.nextDouble();
		
		System.out.println("Digite a segunda nota");
		n2= sc.nextDouble();
		
		media = n1 + 2 * n2 / 3;
		
		if(media > 5)
			System.out.printf("Aluno aprovado");
		else
			System.out.printf("Aluno reprovado");
		
		sc.close();
		
		
	}

}