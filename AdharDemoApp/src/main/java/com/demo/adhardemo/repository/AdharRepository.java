
package com.demo.adhardemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.adhardemo.entity.Adhar;

@Repository
public interface AdharRepository extends JpaRepository<Adhar, Long> {

	public Adhar findByName(String name);

}
