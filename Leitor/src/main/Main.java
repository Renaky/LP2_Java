package main;
import java.util.Scanner;


import leitor.Leitor;
public class Main {
	
	

	public static void main(String[] args) {
		// Teste da classe leitor
		int tamanho=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos numeros quer armazenar: ");
		tamanho = sc.nextInt();
		Leitor leitor = new Leitor();
		
		
		leitor.settamVetor(+tamanho);
		leitor.criaVetor();
		sc.close();
		
		
		
		
	}

}
