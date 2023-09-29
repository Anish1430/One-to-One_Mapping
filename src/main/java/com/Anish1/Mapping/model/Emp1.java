package com.Anish1.Mapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Emp1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    private String empName;

    @OneToOne
    @JoinColumn(name = "foreign_Key_address")
    Address address;
}
