package atv;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner (System.in);
		double horatrab, valorhora, salbruto, saliliquido, inss;
		
		System.out.println("Horas Trabalhadas: ");
		horatrab = src.nextDouble();
		System.out.println("Valor Hora: ");
		valorhora = src.nextDouble();
		
		salbruto = horatrab * valorhora;
		inss = salbruto * 0.12;
		saliliquido = salbruto - inss;
		System.out.println("O valor do salário bruto é "+salbruto);
		System.out.println("O valor do salário liquido é "+saliliquido);
		
		
		
		src.close();

		
	}

}
