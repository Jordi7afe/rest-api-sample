package com.sample.service.crud;

import com.sample.mapper.AbstractMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
public class AbstractCrudService<K extends Serializable, V, E> implements CrudService<K, E> {

    @Autowired
    protected AbstractMapper<V, E> mapper;

    @Autowired
    protected JpaRepository<V, K> repository;

    @Override
    public List<E> list() {
        return mapper.toDTO(repository.findAll());
    }

    @Override
    public E get(K id) {
        return mapper.toDTO(repository.findOne(id));
    }

    @Override
    public E save(E item) {
        return mapper.toDTO(repository.save(mapper.toEntity(item)));
    }

    @Override
    public void delete(K id) {
        repository.delete(id);
    }
}
