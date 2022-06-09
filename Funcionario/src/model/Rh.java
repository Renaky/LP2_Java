package model;

import java.util.ArrayList;
import java.util.List;

public class Rh {
	
	
	private String nome;
	private List<Funcionarios> funcionarios;
	private List<Docente> docentes;
	private List<Tecnico> tecnicos;
	private List<Terceirizado>terceirizados;
	
	public List<Terceirizado> getTerceirizados() {
		return terceirizados;
	}

	public void setTerceirizados(List<Terceirizado> terceirizados) {
		this.terceirizados = terceirizados;
	}

	public void setFuncionarios(List<Funcionarios> funcionarios) {
		this.funcionarios = funcionarios;
	}

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

	public List<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}

	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}

	public void setTecnicos(List<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}
}