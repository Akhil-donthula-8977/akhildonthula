package com.portfolio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.Entit.queryForm;
import com.portfolio.services.qeuryFormsServices;

@Controller
public class MainController {

	 private qeuryFormsServices repo;
	 
	  @Autowired
	  void MainController(qeuryFormsServices repo) {
		  this.repo=repo;
	  }
	  
	  @GetMapping("/")
	  public String send(Model theModel) {
		  theModel.addAttribute("name","akhil");
		  return "index";
	  }
	  
	
	  
	  @GetMapping("/contactpage")
	  public String sendContactpage(Model theModel) {
		  theModel.addAttribute("name","akhil");
		  return "contact page";
	  }
	  
	  
	  @GetMapping("/recentqueries")
	  public String sendQueries(Model theModel) {
		
		 List<queryForm> answer=repo.findall();
		 theModel.addAttribute(/*attribute name*/"queries", answer);
		 return "contact page";
	  }
	  
	  
	
	  
	  
}
