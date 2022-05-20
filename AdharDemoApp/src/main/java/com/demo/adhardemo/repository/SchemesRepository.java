
package com.demo.adhardemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.adhardemo.entity.Schemes;

@Repository
public interface SchemesRepository extends JpaRepository<Schemes, Long> {
	
	List<Schemes> findByName(String name);

}
