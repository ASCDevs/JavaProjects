package biblioteca.entidades;

public class Professor extends Usuario {

	private String disciplina;
	
	Professor(int cpf, String nome, String endereco, String disciplina) {
		super(cpf, nome, endereco);
		this.disciplina = disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		return this.disciplina;
	}

}
