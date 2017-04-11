package com.msnake.alex.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Машина
 *
 * @author shigaevak
 * @since 11.04.2017
 */

@Entity
@Table(name = "car")
@Getter
@Setter
public class Car {

    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_section", referencedColumnName = "ID")
    private Section section;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_model_row", referencedColumnName = "ID")
    private ModelRow modelRow;
}
