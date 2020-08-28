package biblioteca.entidades;

import java.util.ArrayList;

public class Obra {
	
	private int nRegistro, ano;
	private String nome, editora, idioma, genero, tipoExemplar;
	private ArrayList<Autor> autores = new ArrayList<Autor>();
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTipoExemplar() {
		return tipoExemplar;
	}
	public void setTipoExemplar(String tipoExemplar) {
		this.tipoExemplar = tipoExemplar;
	}
	public String getAutores() {
		return autores.toString();
	}
	public void setAutores(int id, String nome, String nacionalidade) {
		autores.add(new Autor(id,nome,nacionalidade));
	}
	public int getnRegistro() {
		return nRegistro;
	}
	
	
}
