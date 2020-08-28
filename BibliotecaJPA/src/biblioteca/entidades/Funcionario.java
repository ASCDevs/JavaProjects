package biblioteca.entidades;

public class Funcionario extends Usuario {

	private String cargo,setor;
	
	Funcionario(int cpf, String nome, String endereco,String cargo, String setor){
		super(cpf,nome,endereco);
		this.cargo = cargo;
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
