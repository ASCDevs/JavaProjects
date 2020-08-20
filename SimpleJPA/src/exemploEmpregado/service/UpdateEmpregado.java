package exemploEmpregado.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import exemploEmpregado.entidade.Empregado;

public class UpdateEmpregado {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Empregado empregado = entitymanager.find(Empregado.class, 1201);
		
		//antes da atualização
		System.out.println(empregado);
		empregado.setSalario(4500);
		entitymanager.getTransaction().commit();
		
		System.out.println("-------");
		
		//após a atualização
		System.out.println(empregado);
		entitymanager.close();
		emfactory.close();
	}
}
