package com.Anish1.Mapping.service;

import com.Anish1.Mapping.model.Emp1;
import com.Anish1.Mapping.repo.Emp1Repo;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Emp1Service {
    @Autowired
    Emp1Repo emp1Repo;

    public List<Emp1> getEmployee() {
      return emp1Repo.findAll();
    }


    public String saveEmp(Emp1 newEmp) {
        emp1Repo.save(newEmp);
        return "Employee added";
    }
}
