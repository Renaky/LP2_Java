package model;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Funcionarios {
	private String setor;
	double bonus=0;
	private String siape;
	private List<Tecnico> tecnicos;

	public String getSetor() {
		return setor;
	}




	public void setSetor(String setor) {
		this.setor = setor;
	}




	public String getSiape() {
		return siape;
	}




	public void setSiape(String siape) {
		this.siape = siape;
	}




	public Tecnico(String cpf,String siape, String nome,String endereco, String dataAdmissao, int titulo, String setor,double salarioBase) {
		
		super(cpf, nome,endereco, dataAdmissao, titulo, salarioBase);
		this.setor=setor;
		tecnicos = new ArrayList<Tecnico>();
		this.siape=siape;
	

		if(titulo == 1) {
			bonus = 0;
		}
		if(titulo ==2) {
			bonus = getSalarioBase()* 0.15;
		}
		if(titulo==3 ) {
			bonus = getSalarioBase()* 0.30;
		}
		


	}
	
	public String toString(){
		return "CPF: " +getCpf() + " | Siape: "+ getSiape() + " | Nome: " + getNome() +   " | Data Admissao: " +getDataAdmissao() +  " | Titula??o (1 Prof, 2 Msc, 3 Dr.): " + getTitulo() + " | Salario: " 
	+ calculaSalario()+ " | " + "Setor: " +getSetor() + "\nEndere?o: "+getEndereco();
	
	}
	
	@Override
	public double calculaSalario() {
		return getSalarioBase() + (bonus);
	}
	
	
}