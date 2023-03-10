package org.example.controller;

import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployee", employeeService.getAllEmployee());
        return "index";
    }
}
