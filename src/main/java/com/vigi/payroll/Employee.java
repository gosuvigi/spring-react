package com.vigi.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vigi on 12/29/2015.
 */
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String description;

    private Employee() {
    }

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
