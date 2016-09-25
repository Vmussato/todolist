package br.senaisp.informatica.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.senaisp.informatica.todolist.dao.ItemDao;

@RestController
public class iTemRestController {
	@Autowired
	private ItemDao itemDao;
	
	@RequestMapping(value="/item/{id}",method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> marcarFeito(Long idItem, String strFeito){
		@PathVariable("id")long idItem, @RequestBody String strFeito){
			
		}
	}
}
