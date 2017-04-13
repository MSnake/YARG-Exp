package com.msnake.alex.model;

import lombok.*;

import javax.persistence.*;

/**
 * Раздел в каталоге
 *
 * @author shigaevak
 * @since 11.04.2017
 */
@Entity
@Table(name = "section")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Section {

    @Id
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_head", referencedColumnName = "ID")
    private Section head;
}
