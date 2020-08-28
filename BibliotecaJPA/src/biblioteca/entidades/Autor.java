package biblioteca.entidades;

public class Autor {

	private int id;
	private String nome, nacionalidade, sobre;
	
	Autor(int id, String nome, String nacionalidade){
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	
}
