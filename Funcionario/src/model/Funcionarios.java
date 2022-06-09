package model;

import java.util.List;
import java.util.ArrayList;


public abstract class Funcionarios {
	private String cpf;
	private String nome;
	private List<Funcionarios> funcionarios;
	private String dataAdmissao;
	private int titulo;
	private double salarioBase;
	
	
	
	
	
	

	public Funcionarios(String cpf, String nome, String dataAdmissao, int titulo,double salarioBase) {
		this.cpf=cpf;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		funcionarios = new ArrayList<Funcionarios>();
		this.titulo = titulo;
		this.salarioBase=salarioBase;
		
		

		
	}





	





	public String getCpf() {
		return cpf;
	}





	public void setCpf(String cpf) {
		this.cpf = cpf;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDataAdmissao() {
		return dataAdmissao;
	}





	public int getTitulo() {

		if(titulo >3 ) {
			return 0;

		}
		return titulo;
	}





	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}





	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

		

	public double getSalarioBase() {
		return salarioBase;
	}





	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}







	public abstract double calculaSalario();





	






	public void add(Funcionarios funcionarios2) {
		funcionarios.add(funcionarios2);
	}
}




//Todos os funcionários possuem CPF, nome, endereço, data de admissão, titulação e salário base.