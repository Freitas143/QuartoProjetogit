package segundo_projeto;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,soma;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o valor 1: ");
		a = ler.nextDouble();
		System.out.println("Digite o valor 2: ");
		b = ler.nextDouble();
		
		soma = a+b;
		
		System.out.println("O resultado é de : "+soma);
		
		ler.close();
	}
}
