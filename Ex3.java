import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a sua letra: ");
		char letra = entrada.next().charAt(0);
		
		if (letra == ("M")) {
			System.out.println("M - Masculino");
		}  else {
			System.out.print("F - Feminino");
		}
		
		
		entrada.close();
	}
}