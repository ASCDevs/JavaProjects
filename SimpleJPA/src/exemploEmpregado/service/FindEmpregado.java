package exemploEmpregado.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import exemploEmpregado.entidade.Empregado;

public class FindEmpregado {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		Empregado empregado = entitymanager.find(Empregado.class, 1202);
		
		JOptionPane.showMessageDialog(null, empregado.toString());
	}

}
