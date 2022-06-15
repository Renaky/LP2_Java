package model;

import java.util.ArrayList;
import java.util.List;

public class Rh {
	
	
	private String nome;
	private List<Funcionarios> funcionarios;
	
	


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
		
	
	public List<Funcionarios> buscaFuncionario(String nomeBusca) {
		List<Funcionarios> aux = new ArrayList<Funcionarios>();
	       for(Funcionarios f:funcionarios) {
	    	   if(f.getNome().equalsIgnoreCase(nomeBusca)) {
	    		   aux.add(f);
	    	   }
}
	    	   
	       
	  return aux;

	}
	public boolean removeFuncionario(Funcionarios funcionario) {
		if (funcionario == null)
			return false;
		
		
		return funcionarios.remove(funcionario);
	}

}