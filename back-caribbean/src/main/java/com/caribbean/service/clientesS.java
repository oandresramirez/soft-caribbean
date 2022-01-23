package com.caribbean.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.caribbean.dto.clientesDao;
import com.caribbean.model.clientesM;

@Service
public class clientesS {
	@Autowired
	private clientesDao clientDao;
	
	public List<clientesM> findId(int nmid) {
		return clientDao.findIdClient(nmid);
	} 
	public List<clientesM> findAll() {
		return clientDao.findAll();
	} 
	public void updateClient(clientesM client) {
		clientDao.save(client);
	} 
	public void insertClient(clientesM client) {
		clientDao.save(client);
	} 
    public boolean existsById(Long id){
        return clientDao.existsById(id);
    }
    public void delete(Long id) {
		clientDao.deleteById(id);
	} 
}
