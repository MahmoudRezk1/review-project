package com.global.springreview.base;

import com.global.springreview.exceptions.RecordNotFoundException;
import jakarta.persistence.MappedSuperclass;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@MappedSuperclass
public class BaseService<T extends BaseEntity<ID>, ID extends Number> {
    @Autowired
    private BaseRepo<T, ID> baseRepo;

    public List<T> findAll() {
        return baseRepo.findAll();
    }

    public T findById(ID id) {
        Optional<T> response = baseRepo.findById(id);
        if (response.isPresent()){
            return response.get();
        }
        throw new RecordNotFoundException("this record not found with this id : "+id);
    }

    public T insert(T t) {
        return baseRepo.save(t);
    }

    public T update(T t) {
        return baseRepo.save(t);
    }

    public void delete(ID id) {
        baseRepo.deleteById(id);
    }
}
