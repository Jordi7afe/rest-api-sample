package com.sample.ws.controller;

import com.sample.service.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
public class CrudController<K extends Serializable, V> {

    @Autowired
    protected CrudService<K, V> service;

    @GetMapping
    public List<V> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public V get(@PathVariable K id) {
        return service.get(id);
    }

    @PostMapping()
    public V save(@RequestBody V item) {
        return service.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(K id) {
        service.delete(id);
    }
}
