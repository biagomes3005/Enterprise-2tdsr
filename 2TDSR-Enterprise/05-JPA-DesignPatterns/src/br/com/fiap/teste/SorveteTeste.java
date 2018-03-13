package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.impl.SorveteDAOImpl;
import br.com.fiap.jpa.entity.Sorvete;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class SorveteTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		//Cadastrar
		Sorvete sorvete = new Sorvete("Chocolate", 10);
		SorveteDAOImpl dao = new SorveteDAOImpl(em);
				
		try {
			dao.create(sorvete);
			dao.commit();
		}catch (CommitException e ) {
			e.printStackTrace();
		}
		
		//Buscar
		Sorvete busca = dao.read(sorvete.getCodigo());
		System.out.println(busca.getSabor());
		
		//Atualizar
		busca.setSabor("Chocolate belfa com Doce de leite");
		try {
			dao.update(busca);
			dao.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//Remover
		try {
			dao.delete(busca.getCodigo());
			dao.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		em.close();
		fabrica.close();
	}

}
