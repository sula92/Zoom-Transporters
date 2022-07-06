package com.sula.eshift.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Unit {

    @Id
    private String id;
    @OneToOne
    private Job job;
    @ManyToMany
    @JoinTable(
            name = "employee_unit",
            joinColumns = {@JoinColumn(name = "unit_id")},
            inverseJoinColumns = {@JoinColumn(name = "employee_id")}
    )
    private List<Employee> employees;
    @ManyToOne
    @JoinColumn(name = "container_id", referencedColumnName = "id")
    private Container container;
    @ManyToOne
    @JoinColumn(name = "lorry_id", referencedColumnName = "id")
    private Lorry lorry;
}
