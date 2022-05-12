package modelo;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String descricao;
	private List<Funcionario> funcionarios;
	
	
	public Departamento(String desc) {
		this.descricao = desc;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	public void adicionaFuncionario(Funcionario pFuncionario) {
		if(this.funcionarios.size() <5) {
			this.funcionarios.add(pFuncionario);
	}
}

	public List<Funcionario> getFuncionarios(){
		return this.funcionarios;
	}
	
		
	
	public String getDescricao() {
		return this.descricao;
	}
}
