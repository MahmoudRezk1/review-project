package com.global.springreview.base;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@MappedSuperclass
public class BaseController<T extends BaseEntity<ID>, ID extends Number> {
    @Autowired
    private BaseService<T, ID> baseService;

    @Operation(summary = "get all items")
    @GetMapping
    public List<T> findAll() {
        return baseService.findAll();
    }

    @Operation(summary = "get item by id")
    @GetMapping(path = "/{id}")
    public T findById(@PathVariable ID id) {
        return baseService.findById(id);
    }

    @Operation(summary = "insert item")
    @PostMapping
    public T insert(@RequestBody @Valid T t) {
        return baseService.insert(t);
    }

    @Operation(summary = "update item")
    @PutMapping
    public T update(@RequestBody @Valid T t) {
        return baseService.update(t);
    }

    @Operation(summary = "delete item by id")
    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable ID id) {
        baseService.delete(id);
    }

}
