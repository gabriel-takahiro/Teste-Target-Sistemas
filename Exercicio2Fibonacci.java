package exercicios;

import java.util.Scanner;

public class Exercicio2Fibonacci {
	public static void main(String[] args) {
		System.out.println("Informe um número para saber se ele faz parte da sequência de fibonacci:");
		Scanner scanner = new Scanner(System.in);
		System.out.println(pertenceSequenciaFibonacci(scanner.nextInt()));
		scanner.close();
	}

	private static String pertenceSequenciaFibonacci(int numeroTeste) {
		if(numeroTeste == 0) {
			return "Pertence a sequência de Fibonacci";
		}
		int valorAnterior = 0;
		int valorSequencia = 1;
		int aux;
		while(numeroTeste > valorSequencia) {
			aux = valorSequencia;
			valorSequencia += valorAnterior;
			valorAnterior = aux;
		}
		if(numeroTeste == valorSequencia) {
			return "Pertence a sequência de Fibonacci";
		}
		return "Não pertence a sequência de Fibonacci";
	}
}
