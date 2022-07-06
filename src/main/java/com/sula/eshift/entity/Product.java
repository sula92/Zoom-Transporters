package com.sula.eshift.entity;

import com.sula.eshift.entity.pk.ProductPK;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @EmbeddedId
    private ProductPK productPK;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Job job;
}
