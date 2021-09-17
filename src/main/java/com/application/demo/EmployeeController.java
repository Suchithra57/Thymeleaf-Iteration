package com.application.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/EmployeeData")
    public String iteration(Model model) {
        List< Employee > employees = new ArrayList< > ();
        employees.add(new Employee("Ramesh", "Fadatare", "ramesh@gmail.com"));
        employees.add(new Employee("John", "Cena", "john@gmail.com"));
        employees.add(new Employee("Tom", "Cruise", "tom@gmail.com"));
        employees.add(new Employee("Tony", "Stark", "tony@gmail.com"));
        
        model.addAttribute("employees", employees);
        return "iteration";
    }
	
	
	@GetMapping("/arraysDemo")
    public String arraysDemo(Model model) {
        String[] planets = {
            "MERCURY",
            "VENUS",
            "EARTH",
            "MARS",
            "JUPITER",
            "SATURN",
            "URANUS",
            "NEPTUNE"
        };
        
		/*
		 * Arrays.sort(planets); for (String planet : planets) {
		 * System.out.println(planet); }
		 */
        
        model.addAttribute("planets", planets);
        return "array-demo";
	}
	
}
