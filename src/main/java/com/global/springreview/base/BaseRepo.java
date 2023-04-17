package com.global.springreview.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepo<T extends BaseEntity<ID>,ID extends Number> extends JpaRepository<T,ID> {

}
