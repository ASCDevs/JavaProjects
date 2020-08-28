package biblioteca.entidades;

public abstract class Usuario {
	
	private int cpf;
	private String nome, endereco;
	
	Usuario(int cpf, String nome, String endereco){
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	
	
	public double getCpf() {
		return this.cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	
}
