package com.portfolio.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.Entit.queryForm;
import com.portfolio.entityRepos.queryFormsRepo;

import jakarta.transaction.Transactional;

@Service
public class qeuryFormsServices {
	private queryFormsRepo formrepo;
	public void qeuryFormsServices() {
		
	}
	
	@Autowired
	public void queryFormsServices (queryFormsRepo formrepo) {
		this.formrepo=formrepo;
	}
	
	
	public void Saveform(queryForm form)
	{
		formrepo.save(form);
	}
	
	public List<queryForm> findall() {
		return formrepo.findAll();
	}

	public Optional<queryForm> findById(int id) {
		
		return formrepo.findById(id);
	}

	public void deleteById(int id) {
	formrepo.deleteById(id);
		
	}


	
}
