package com.sample.service.crud;

import java.io.Serializable;
import java.util.List;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
public interface CrudService<K extends Serializable, V> {

    List<V> list();

    V get(K id);

    V save(V item);

    void  delete(K id);
}
