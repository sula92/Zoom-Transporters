package com.sula.eshift.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {

    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "starting_address")
    private String startingAddress;
    @Column(name = "destintion_address")
    private String destinationAddress;

}
