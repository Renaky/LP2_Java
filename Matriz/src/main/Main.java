package main;

import java.util.Scanner;

import gerador.Matriz;

public class Main {
	public static void main(String[] args) {
		
		Matriz m = new Matriz();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor A: ");
		m.setA(sc.nextInt());
		System.out.print("\nInsira o valor B: ");
		m.setB(sc.nextInt());
		System.out.print("\nInsira o valor de C: ");
		m.setC(sc.nextInt());
		System.out.print("\nInsira o valor de D: ");
		m.setD(sc.nextInt());
		
		
		
		
		System.out.println("Valores Preenchidos:  "+m.getA()  + m.getB()+m.getC()+m.getD()); // testando valores inseridos
		
		
		


}
}