package com.global.springreview.base;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@MappedSuperclass
public class BaseController<T extends BaseEntity<ID>, ID extends Number> {
    @Autowired
    private BaseService<T, ID> baseService;

    @GetMapping
    public List<T> findAll() {
        return baseService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<T> findById(@PathVariable ID id) {
        return baseService.findById(id);
    }

    @PostMapping
    public T insert(@RequestBody @Valid T t) {
        return baseService.insert(t);
    }

    @PutMapping
    public T update(@RequestBody @Valid T t) {
        return baseService.update(t);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable ID id) {
        baseService.delete(id);
    }

}
