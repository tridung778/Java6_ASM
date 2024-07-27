package com.example.Java6_ASM.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseModel {

    String name;
    String image;
    Double price;
    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    Date createdAt;
    boolean available;
    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<OrderDetail> orderDetails;

}
