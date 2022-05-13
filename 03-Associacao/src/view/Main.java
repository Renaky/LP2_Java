package view;

import model.Empresa;
import model.Funcionario;

public class Main {
	public static void main(String [] args) {
		
		Empresa banco = new Empresa("Sofisa", "1347852-0001-78");
		Empresa loja = new Empresa("Magalu","14456789-0001/24");
		Funcionario emerson = new Funcionario("Emerson Renaki",1850.00, "151.305.16-87" ,banco);
		
		Funcionario carlos = new Funcionario("Carlos Nobrega",1450.00, "305.144.12-07" ,loja);
		
		banco.adicionaFuncionario(emerson);
		loja.adicionaFuncionario(carlos);
		
		for(Funcionario f:banco.getFuncionario()) {
			System.out.println(f);
		}
		
		for(Funcionario f:loja.getFuncionario()) {
			System.out.println(f);
		}


	}
}
