package com.global.springreview.entity;

import com.global.springreview.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Schema(name = "Role Schema")
@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role extends BaseEntity<Long> {
    @Column(unique = true,nullable = false)
    private String name;

}
