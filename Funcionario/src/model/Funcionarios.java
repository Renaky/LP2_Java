package model;

import java.util.List;
import java.util.ArrayList;

public abstract class Funcionarios {
	private String cpf;
	private String nome;
	private String endereco;
	private String dataAdmissao;
	private int titulo;
	private double salarioBase;

	public Funcionarios(String cpf, String nome,String endereco, String dataAdmissao, int titulo, double salarioBase) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.endereco= endereco;
		this.titulo = titulo;
		this.salarioBase = salarioBase;
		

	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

		if (titulo > 3) {
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


	}



//Todos os funcionários possuem CPF, nome, endereço, data de admissão, titulação e salário base.