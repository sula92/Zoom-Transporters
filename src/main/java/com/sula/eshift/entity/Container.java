package com.sula.eshift.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Container {

    @Id
    private String id;
    @Column(name = "max_weight")
    private String maxWeight;
    @OneToMany(mappedBy = "container")
    private List<Unit> units;
}
