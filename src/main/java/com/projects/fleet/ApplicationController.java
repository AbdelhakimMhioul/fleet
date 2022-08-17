package com.projects.fleet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

   // @Autowired
   // private EmployeeService employeeService;

   @GetMapping("/")
   public String indexPage() {
      return "index";
   }

   @GetMapping("/login")
   public String loginPage() {
      return "login";
   }

   @GetMapping("/register")
   public String registerPage() {
      return "register";
   }

   @GetMapping("/blank")
   public String blankPage() {
      return "blank";
   }
}
