package com.sula.eshift.entity.pk;

import com.sula.eshift.entity.Job;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductPK implements Serializable {

    @Column(name = "job_id")
    private String job;
    @Column(name = "product_name")
    private String productName;

}
