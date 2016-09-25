package br.senaisp.informatica.todolist.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.senaisp.informatica.todolist.modelo.Lista;

@Repository
public class ListaDao {
	@PersistenceContext
	private EntityManager manager;
	
	@Transactional
	public void inserir(Lista lista){
		manager.persist(lista);
	}
	
	public List<Lista> listar(){
		TypedQuery<Lista> query = 
				manager.createQuery
				("select l from Lista l", Lista.class);
		return query.getResultList();
	}
	
}
