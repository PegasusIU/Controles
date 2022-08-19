import java.util.Scanner;


public class Ex5 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a sua letra: ");
		char letra = entrada.next().charAt(0);
		
		if ((letra == ("A")) || (letra == ("E")) || (letra == ("I")) || (letra == ("O")) || (letra == ("U"))) {
			System.out.println("Vogal");
		}  else {
			System.out.print("Consoante");
		}
		
		
		entrada.close();
	}
}