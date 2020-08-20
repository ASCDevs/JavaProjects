package exemploEmpregado.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Empregado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String nome;
	private double salario;
	private String cargo;
	
	public Empregado (int id, String nome, double salario, String cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public Empregado() {
		super();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Empregado id: " + id + "\nNome: " + nome + "\nSalario: " + salario + "\nCargo: " + cargo;
	}
	
}
