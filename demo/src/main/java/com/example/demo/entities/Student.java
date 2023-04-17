package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

//use List for many to many relation, JoinTable annotation for creating a new table
//@JoinTable( name = 'new_Table_name'
// joinColumns = @JoinColumn)
// name = 'table1', referencedColumnName = 'name'),
//inverseJoinColumns = @JoinColumn(
//        name = 'table2' , referencedColumnName = 'name'))
//)



@Entity
public class Student {
    @Id
    @GeneratedValue
    Long id;
    String name;
    Long roll;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRoll() {
        return roll;
    }

    public void setRoll(Long roll) {
        this.roll = roll;
    }
}
