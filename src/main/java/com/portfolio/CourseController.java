//package com.portfolio;
//
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.portfolio.Entit.queryForm;
//import com.portfolio.services.qeuryFormsServices;
//
//@Controller
//@RequestMapping("/course")
//public class CourseController {
//	
//	private qeuryFormsServices repo;
//	
//	  @Autowired
//	  void MainController(qeuryFormsServices repo) {
//		  this.repo=repo;
//	  }
//	
//	@RequestMapping("/add")
//	public String add(Model theModel) {
//		queryForm obj=new queryForm();
//		theModel.addAttribute("queryEmp",obj);
//		return "addEmp";
//	}
//	
//	@GetMapping("/get")
//	public String get(Model theModel) {
//		List<queryForm> answer=repo.findall();		
//		theModel.addAttribute("employees",answer);
//        
//		return "list-employees";
//	} 
//	
////	@PostMapping("/addquery")
////	public String addemp(Model theModel) {
//////		List<queryForm> answer=repo.findall();		
//////		theModel.addAttribute("employees",answer);
////        
////		return "list-employees";
//	
////	}
//	
//	
//	
//	
//	  @PostMapping(value="/addquery")
//	  public String SaveFormData(@ModelAttribute("queryEmp") @Valid queryForm form,BindingResult result) {
//		  if(result.hasErrors()) {
//			 return "error"; 
//		  }
//		  else {
//		  repo.Saveform(form);
//		  //post save and get design patern to avoid multiple submissions causes duplicates
//		  return "redirect:/course/get";
//		  }
//	  }
//	  
//	  @GetMapping("/updateform")
//	  public String formUpdate(@RequestParam("empid")int id,Model theModel) {
//		  
//		  //get the id data
//		  Optional<queryForm> query=repo.findById(id);
//		  
//		  //populate the form by obejct queryEmp
//		  theModel.addAttribute("queryEmp"/*already this atribute object there in form so we have use this only* in form*/,query);
//		  
//		  //return the view(html page)
//		  return "addEmp";
//	  }
//	  
//	  
//	  
//	  @GetMapping("/deleteform")
//	  public String formDelete(@RequestParam("empid")int id,Model theModel) {
//		  
//		  //get the id data
//		  Optional<queryForm> query=repo.findById(id);
//		  
//		  //populate the form by obejct queryEmp
//		 // theModel.addAttribute("queryEmp"/*already this atribute object there in form so we have use this only* in form*/,query);
//		  
//		  
//		  //delete the data send by id
//		  repo.deleteById(id);
//		  
//		 
//		  
//		  
//		  //return the view(html page)
//		  return "redirect:/course/get";
//	  }
//	  
//	  
//	
//}
