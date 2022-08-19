import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o seu ano com 4 dígitos: ");
		int ano = entrada.nextInt();
		
		if ((ano % 10 != 0) && (ano % 4 = 0)) {
			System.out.print("É um ano bissexto");
		}  else {
			System.out.print("Não é um ano bissexto");
		}
		
		
		entrada.close();
	}
}