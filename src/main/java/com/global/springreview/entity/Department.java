package com.global.springreview.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.global.springreview.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department extends BaseEntity<Long> {
    @Column(unique = true)
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
    private List<Employee> employees;
}
