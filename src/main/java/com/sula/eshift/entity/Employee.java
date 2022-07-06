package com.sula.eshift.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Employee {

    @Id
    private String id;
    private String name;
    private String position;
    @Column(name = "contact_number")
    private String contactNumber;
    private String email;

}
