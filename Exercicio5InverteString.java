package exercicios;

import java.util.Scanner;

public class Exercicio5InverteString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o texto que deseja inverter:");
		String texto = scanner.nextLine();
		String textoInvertido = "";
		for(int i = texto.length(); i > 0; i--) {
			textoInvertido += texto.substring(i-1, i);
		}
		System.out.println(textoInvertido);
		scanner.close();
	}
}
