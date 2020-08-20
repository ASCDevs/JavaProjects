package exemploEmpregado.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import exemploEmpregado.entidade.Empregado;

public class DeleteEmpregado {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Empregado empregado = entitymanager.find(Empregado.class,1202);
		entitymanager.remove(empregado);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
		
	}

}
