package com.msnake.alex.model;

import lombok.*;

import javax.persistence.*;

/**
 * Модельный ряд (комплектация)
 *
 * @author shigaevak
 * @since 11.04.2017
 */
@Entity
@Table(name = "model_row")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelRow {

    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "base_price")
    private Integer basePrice;

    @Column(name = "max_price")
    private Integer maxPrice;

    @Column(name = "note")
    private String note;
}
