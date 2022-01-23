package com.caribbean.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.caribbean.model.clientesM;

@Repository
public interface clientesDao extends JpaRepository<clientesM, Long> {
	
	@Query(nativeQuery = true, value ="SELECT * FROM tcus_clientes where nmid = :vn_nmid")
	List<clientesM> findIdClient(int vn_nmid);
	
	@Query(nativeQuery = true, value ="DELETE FROM tcus_clientes where nmid = :vn_nmid")
	void deleteIdClient(int vn_nmid); 
}
