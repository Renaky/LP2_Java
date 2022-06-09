package model;

public class Endereco {
	private String logradouro;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;

	public Endereco(){
		
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Endereco(String logradouro, String bairro, String cidade, String cep, String uf) {
		this.logradouro = logradouro;
		this.bairro=bairro;
		this.cidade=cidade;
		this.cep=cep;
		this.uf=uf;
				
				
	}
}
