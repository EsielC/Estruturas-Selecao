import java.util.Scanner;

public class velocidade_final_do_carro {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Double vf,vi,ac,t;
		
		System.out.println("Digite o valor da velocidade inicial: ");
		vi = sc.nextDouble();
		System.out.println("Digite o valor aceleração: ");
		ac = sc.nextDouble();
		System.out.println("Digite o tempo de percurso");
		t = sc.nextDouble();
		
		vf = (vi + (ac * t)) * 3.6;
		
		System.out.println("A velocidade final do carro é: "+ vf);
				
		
		sc.close();
		
	}

}