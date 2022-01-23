package com.caribbean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caribbean.model.clientesM;
import com.caribbean.model.msj;
import com.caribbean.service.clientesS; 

@RestController
@RequestMapping("/api")
public class clientesC {

	@Autowired
	private clientesS clientS; 
	
	@RequestMapping(value = "/find-one-client/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	public msj findClient(@PathVariable("id") int id) {
		msj msj2 = new msj();
		try { 
			msj2.setError(false);
			msj2.setMessage("Consulta exitosa."); 
			msj2.setList(clientS.findId(id));
			return msj2;
		} catch (Exception e) {
			msj2.setError(true);
			msj2.setMessage("Error al tratar de consultar."); 
			return msj2;
		}
	}

	@RequestMapping(value = "/find-all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	public msj findClient() {
		msj msj2 = new msj();
		try { 
			msj2.setError(false);
			msj2.setMessage("Consulta exitosa."); 
			msj2.setList(clientS.findAll());
			return msj2;
		} catch (Exception e) {
			msj2.setError(true);
			msj2.setMessage("Error al tratar de consultar."); 
			return msj2;
		}
	}
	
	@RequestMapping(value = "/update-client/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	public msj actualizarClient(@PathVariable("id") Long id, @RequestBody clientesM client) {
		msj msj2 = new msj();
		try {
			client.setNmid(id);
			clientS.updateClient(client);
			
			msj2.setError(false);
			msj2.setMessage("Actualización exitosa."); 
			return msj2;
		} catch (Exception e) {
			msj2.setError(true);
			msj2.setMessage("Error al tratar de actualizar."); 
			return msj2;
		}
	}

	@RequestMapping(value = "/insert-client", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
	public msj insertClient(@RequestBody clientesM client) {
		msj msj2 = new msj();
		try { 
			clientS.insertClient(client);
			
			msj2.setError(false);
			msj2.setMessage("Creación exitosa."); 
			return msj2;
		} catch (Exception e) {
			msj2.setError(true);
			msj2.setMessage("Error al tratar de crear cliente."); 
			return msj2;
		}
	}
	 
	@RequestMapping(value = "/delete-client/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin
    public msj delete (@PathVariable("id") Long id){
		msj msj2 = new msj();
		try { 
			clientS.delete(id);  
			msj2.setError(false);
			msj2.setMessage("Eliminación exitosa."); 
			return msj2;
		} catch (Exception e) {
			msj2.setError(true);
			msj2.setMessage("Error al tratar de eliminar cliente."); 
			return msj2;
		}
    }
}
