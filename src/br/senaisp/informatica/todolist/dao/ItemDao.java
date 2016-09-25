package br.senaisp.informatica.todolist.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.senaisp.informatica.todolist.modelo.ItemLista;

@Repository
public class ItemDao {
	@PersistenceContext
	private EntityManager manager;
	
	@Transactional
	public void marcarFeito(Long idItem, boolean valor){
		ItemLista item = manager.find(ItemLista.class, idItem);
		item.setFeito(valor);
		manager.merge(item);
	}
}
