package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionarios;



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Funcionario> getFuncionario() {
		return funcionarios;
	}
	
	

	public Empresa() {

	}
	
	public Empresa(String nome, String cnpj) {

		this.nome=nome;
		this.cnpj=cnpj;
		this.funcionarios = new ArrayList<Funcionario>();

	}
	public void adicionaFuncionario(Funcionario pFuncionario) {
			this.funcionarios.add(pFuncionario);
	}


}
