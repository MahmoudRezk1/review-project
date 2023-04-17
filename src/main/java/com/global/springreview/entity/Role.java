package com.global.springreview.entity;

import com.global.springreview.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role extends BaseEntity<Long> {
    @Column(unique = true,nullable = false)
    private String name;

}
