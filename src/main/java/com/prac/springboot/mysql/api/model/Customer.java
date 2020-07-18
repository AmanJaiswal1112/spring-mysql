package com.prac.springboot.mysql.api.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer
{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;
    @OneToMany(targetEntity = Product.class)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    private List<Product> products;

}
