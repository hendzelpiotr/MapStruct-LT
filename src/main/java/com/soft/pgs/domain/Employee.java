package com.soft.pgs.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Piotr on 20.06.2017.
 */
@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Getter(AccessLevel.NONE)
    private String name;
    @OneToMany(mappedBy = "employee")
    private List<Car> cars;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Employee manager;

}
