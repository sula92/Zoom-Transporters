package com.sula.eshift.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Lorry {

    @Id
    private String id;
    private String model;
    private String status;
    @OneToMany(mappedBy = "lorry")
    private List<Unit> units;
}
