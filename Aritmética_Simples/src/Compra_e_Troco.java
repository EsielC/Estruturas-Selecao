import java.util.Scanner;

public class Compra_e_Troco {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double p1,p2,p3,p4,p5,soma,pag,troco;
		
		System.out.println("Digite os valores dos produtos:  ");
		p1 = sc.nextDouble();
		p2 = sc.nextDouble();
		p3 = sc.nextDouble();
		p4 = sc.nextDouble();
		p5 = sc.nextDouble();
		
		soma = p1+p2+p3+p4+p5;
		
		System.out.printf("Digite um valor de pagamento: ");
		pag = sc.nextDouble();
		
		troco = pag - soma;
		
		System.out.printf("O valor do troco é: %.2f", troco);
		
		
		sc.close();
		
	}

}