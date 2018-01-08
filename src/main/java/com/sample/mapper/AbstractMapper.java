package com.sample.mapper;

import java.util.List;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
public interface AbstractMapper<K, V> {

    List<V> toDTO(List<K> values);

    V toDTO(K value);

    List<K> toEntity(List<V> values);

    K toEntity(V value);
}
