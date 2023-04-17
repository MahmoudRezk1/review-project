package com.global.springreview.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.global.springreview.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends BaseEntity<Long> {

    @NotBlank(message = "you must insert a name")
    @Column(length = 255)
    private String name;

    @NotBlank(message = "you must insert an email")
    @Email
    @Column(length = 255)
    private String email;

    @NotBlank(message = "you must insert a number")
    @Column(length = 15)
    private String phoneNumber;

    @NotNull
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @OneToOne(mappedBy = "employee", fetch = FetchType.EAGER)
    @JsonIgnore
    private User user;

}
