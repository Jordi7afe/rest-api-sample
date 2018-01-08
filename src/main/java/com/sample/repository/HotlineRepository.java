package com.sample.repository;

import com.sample.model.Hotline;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
public interface HotlineRepository extends JpaRepository<Hotline, Long> {

    List<Hotline> getByDateIsAfter(Date date);
}
