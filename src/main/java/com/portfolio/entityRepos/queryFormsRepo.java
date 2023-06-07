package com.portfolio.entityRepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.Entit.queryForm;

public interface queryFormsRepo extends JpaRepository<queryForm,Integer> {

	 List<queryForm> findAll();
}
