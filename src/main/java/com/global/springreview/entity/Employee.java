package com.global.springreview.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.global.springreview.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Schema(name = "Employee Schema")
@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends BaseEntity<Long> {

    @NotBlank(message = "{validation.constraints.name.message}")
    @Column(length = 255)
    private String name;

    @NotBlank(message = "{validation.constraints.Email.Blank.message}")
    @Email(message = "{validation.constraints.Email.message}")
    @Column(length = 255)
    private String email;

    @NotBlank(message = "{validation.constraints.phoneNumber.message}")
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
