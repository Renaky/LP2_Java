package model;



public class Docente extends Funcionarios {
	private String area;
	double bonus=0;
	String siape;
	
	
		
	

	public Docente(String cpf,String siape, String nome, String dataAdmissao, int titulo, String area,double salarioBase) {
		
		super(cpf, nome, dataAdmissao, titulo, salarioBase);
		this.area=area;
		this.siape=siape;
		

		

	if(titulo == 1) {
		bonus = 0;
	}
	if(titulo ==2) {
		bonus = getSalarioBase()* 0.20;
	}
	if(titulo==3 ) {
		bonus = getSalarioBase()* 0.40;
	}


	}
	
	
	
	
	public String getArea() {
		return area;
	}




	public void setArea(String area) {
		this.area = area;
	}




	public String getSiape() {
		return siape;
	}




	public void setSiape(String siape) {
		this.siape = siape;
	}
	
	public String toString(){
		return "CPF: " +getCpf() + " | Siape: "+ getSiape() + " | Nome: " + getNome() +   " | Data Admissao: " +getDataAdmissao() +  " | Titulação (1 Prof, 2 Msc, 3 Dr.): " + getTitulo() + " | Salario: " 
	+ calculaSalario()+ " | " + "Area atuacao: " +getArea();


	}


	@Override
	public double calculaSalario() {
		return getSalarioBase() + (bonus);
	}
	
	
}

