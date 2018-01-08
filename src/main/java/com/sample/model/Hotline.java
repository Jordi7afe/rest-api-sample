package com.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
@Entity
@Table(name = "hotlinellamades")
public class Hotline {

    @Id
    @SequenceGenerator(name = "HOTLINE_ID_GENERATOR", sequenceName = "HOTLINE_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HOTLINE_ID_GENERATOR")
    private Long id;

    @Column(name = "attr_name")
    private String attribute;

    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
