package br.senaisp.informatica.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.senaisp.informatica.todolist.dao.ItemDao;
import br.senaisp.informatica.todolist.modelo.ItemLista;

@RestController
public class iTemRestController {
	@Autowired
	private ItemDao itemDao;
	
	@RequestMapping(value="/item/{id}",method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> marcarFeito(Long idItem, String strFeito){
		@PathVariable("id")long idItem, @RequestBody String strFeito){
			
		}
	}
	
	@RequestMapping(value="/lista/{idLista}/item",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ItemLista> addItem(@PathVariable long idLista,@RequestBody ItemLista item){
	try{
		itemDao.inserir(idLista, item);
		URI location = new URI("/item/" + item.getId());
		return ResponseEntity.created(location).body(item);
	} catch (Exception e){
		e.printStackTrace();
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
