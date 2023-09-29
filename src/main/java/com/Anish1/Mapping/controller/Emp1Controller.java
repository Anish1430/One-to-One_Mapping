package com.Anish1.Mapping.controller;

import com.Anish1.Mapping.model.Emp1;
import com.Anish1.Mapping.service.Emp1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Emp1Controller {

    @Autowired
    Emp1Service emp1Service;
    @GetMapping("emp1")
    public List<Emp1> getEmployee(){
      return emp1Service.getEmployee();
    }

    @PostMapping("emp")
    public String addEmp(@RequestBody Emp1 newEmp)
    {
        return emp1Service.saveEmp(newEmp);
    }

}
