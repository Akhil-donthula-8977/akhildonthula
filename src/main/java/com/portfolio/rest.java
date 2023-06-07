package com.portfolio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.Entit.queryForm;
import com.portfolio.services.qeuryFormsServices;



@RestController
public class rest {
	private qeuryFormsServices repo;
	
	  @Autowired
	  void rest(qeuryFormsServices repo) {
		  this.repo=repo;
	  }
	  @PostMapping(value="/add", consumes = "application/json")
	  public String SaveFormData(@RequestBody queryForm form) {
		  repo.Saveform(form);
		  return "form submitted successfully";
	  }
	  
	
	  @GetMapping("/allqueries")
	  public List<queryForm> allqueries() {
			 List<queryForm> answer=repo.findall();
			 return answer;
	  }
	
}
