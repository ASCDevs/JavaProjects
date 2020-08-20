package exemploEmpregado.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import exemploEmpregado.entidade.Empregado;

public class CreateEmpregado {
	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Empregado empregado = new Empregado();
		empregado.setId(1202);
		empregado.setNome("Santos");
		empregado.setSalario(3500);
		empregado.setCargo("Desenvolvedor front-end");
		
		entitymanager.persist(empregado);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
