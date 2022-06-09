package model;

import java.util.ArrayList;
import java.util.List;

public class Rh {
	
	
	private String nome;
	private List<Funcionarios> funcionarios;
	private List<Docente> docentes;
	private List<Tecnico> tecnicos;
	
	public Rh(String nome, Funcionarios funcionario) {
		this.nome = nome;
		funcionarios = new ArrayList<Funcionarios>();
		
		adicionaFuncionario(funcionario);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Funcionarios> getFuncionarios() {
		return this.funcionarios;
	}

	public boolean adicionaFuncionario(Funcionarios funcionario) {
		if (funcionario == null)
			return false;

		
		
		return funcionarios.add(funcionario);
	}
		
		

			
		
	
	public boolean removeFuncionario(Funcionarios funcionario) {
		if (funcionario == null)
			return false;
		
		
		return funcionarios.remove(funcionario);
	}
}