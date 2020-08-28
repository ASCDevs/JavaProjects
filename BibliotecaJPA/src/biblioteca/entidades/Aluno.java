package biblioteca.entidades;

public class Aluno extends Usuario{
	
	private String curso,ra;
	private int semestre;
	
	Aluno(int cpf, String nome, String endereco, String curso, String ra, int semestre){
		super(cpf,nome,endereco);
		this.curso = curso;
		this.ra = ra;
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getRa() {
		return ra;
	}
	
	
}
