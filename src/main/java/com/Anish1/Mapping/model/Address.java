package com.Anish1.Mapping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //For getter and setter
@AllArgsConstructor //for Argument constructor
@NoArgsConstructor  //for no parameterized constructor..
@Entity        //For creating a Table...
public class Address {

    @Id    //for creating a Primary Key...
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String addressName;

}
